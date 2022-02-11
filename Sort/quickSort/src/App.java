
import java.util.Arrays;
import java.util.List;

public class App {

    public static int partition(List<Integer> inputList, int start, int end, int pivot){
        System.out.println("Partition "+ start + " " + end);
        int left = start;
        int right = end;

        while(left < right){
           System.out.println("Left :" + inputList.get(left) + " " + inputList.get(pivot) + " " + (inputList.get(left) <= inputList.get(pivot))); 
           while(inputList.get(left) <= inputList.get(pivot) && left < right) left++;
           System.out.println("left pos: "+ left);
           System.out.println("right :" + inputList.get(right) + " " + inputList.get(pivot) + " " + (inputList.get(right) >= inputList.get(pivot))); 
           while(inputList.get(right) >= inputList.get(pivot)) right--; 
           System.out.println("right pos: "+ right); 
           swap(inputList, right,left); 
           System.out.println("Partition Swap :" + Arrays.toString(inputList.toArray()));  
        }
        System.out.println("Partition Swap item:" + pivot + " "+left);
        swap(inputList, pivot ,left); 
        System.out.println("Partition Pivot Swap :" + Arrays.toString(inputList.toArray()));
        System.out.println("Partition Swap end item:" + left);
        return left;
           
    }

    public static void swap(List<Integer> inputList, int start, int end){
       
        int temp = inputList.get(start);
        inputList.set(start, inputList.get(end));
        inputList.set(end, temp);
        
    }

    public static void quickSort(List<Integer> inputList, int start, int end){
        System.out.println("Quick Sort");
        // start condition
        if(start>=end){
            return;
        }
        System.out.println("Quick Sort - after condition");
        //find mid element to get best/avg case TC of n log n
        int pivot = start+end/2;
        System.out.println("Quick Sort - pivot");
         int partitionIndex = partition(inputList, start, end, pivot);
        System.out.println("Quick Sort - partitionIndex: "+ partitionIndex);
        //D&C
        //left sub tree
        if(start < partitionIndex) quickSort(inputList, start, partitionIndex-1);
        //right sub tree
        if(end > partitionIndex) quickSort(inputList, partitionIndex + 1, end);
    }
    public static void main(String[] args) throws Exception {
        // List<Integer> inputList = new ArrayList<Integer>(Arrays.asList(4,10,7,8,2,5,9));
        // quickSort(inputList, 0, inputList.size()-1);
        // System.out.println(inputList.toArray().toString());

        int[] input = new int[] {4,10,7,8,2,5,9,22,34,1,3,50};
        System.out.println("INPUT : " + Arrays.toString(input));
        ArrayQuickSort.sort(input, 0, input.length-1);

        System.out.println("QUICK SORT : " + Arrays.toString(input));
        int[] inputV2 = new int[] {4,10,7,8,2,5,9,22,34,1,3,50};
        ArrayQuickSortV2.quickSort(inputV2, 0, inputV2.length-1);
        System.out.println("QUICK SORT v2: " + Arrays.toString(inputV2));

        int[] inputSelectionSort = new int[] {4,10,7,8,2,5,9,22,34,1,3,50};
        SelectionSort.sort(inputSelectionSort, 0, inputSelectionSort.length-1);
        System.out.println("SELECTION SORT : " + Arrays.toString(inputSelectionSort));

        int[] inputBubbleSort = new int[] {4,10,7,8,2,5,9,22,34,1,3,50};
        BubbleSort.sort(inputBubbleSort, 0, inputBubbleSort.length-1);
        System.out.println("BUBBLE SORT : " + Arrays.toString(inputBubbleSort));

        int[] inputInsertionSort = new int[] {4,10,7,8,2,5,9,22,34,1,3,50};
        InsertionSort.sort(inputInsertionSort, 0, inputInsertionSort.length-1);
        System.out.println("INSERTION SORT : " + Arrays.toString(inputInsertionSort));

        int[] inputMergeSort = new int[] {4,10,7,8,2,5,9,22,34,1,3,50};
        MergeSort.sort(inputMergeSort, inputMergeSort.length);
        System.out.println("MERGE SORT : " + Arrays.toString(inputMergeSort));
       
    }
}
