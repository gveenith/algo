public class Utility {

    public static void swap(int[] input, int start, int end){
        int temp = input[start];
        input[start] = input[end];
        input[end] = temp;
    }
    
}
