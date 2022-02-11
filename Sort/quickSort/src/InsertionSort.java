public class InsertionSort {
//assume first element is sorted 
//pick next element and compare it with elements in sorted array and if its smaller insert it sorted array
//repeat till end of array
    public static void sort(int[] input, int start, int end){
        for(int i= start+1; i<= end; i++){
            for(int j= i; j>start; j--){
                if(input[j] < input[j-1]){
                    Utility.swap(input, j, j-1);
                }
            }          
        }
    }
    
}
