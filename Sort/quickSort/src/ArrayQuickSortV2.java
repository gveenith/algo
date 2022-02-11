import java.util.Random;
//partition the array 
public class ArrayQuickSortV2{
    public static void quickSort(int[] input, int start, int end){
        if( start>=end){
            return;
        }

     
        int index = partition(input, start, end);

        quickSort(input, start, index - 1);
        quickSort(input, index + 1, end);
    }

    public static int partition(int[] input, int start, int end){
        // int pIndex = new Random().nextInt((end-start)+1)+end;
        //  swap(input, pIndex, end);

        int pivot = input[end];
        for(int i=start;i<end;i++){
            if(input[i] < pivot){
                swap(input, i, start);
                start++;
            }
        }
        swap(input, start, end);
        return start;
    }

    public static void swap(int[] input, int start, int end){
        int temp = input[start];
        input[start] = input[end];
        input[end] = temp;
    }
}