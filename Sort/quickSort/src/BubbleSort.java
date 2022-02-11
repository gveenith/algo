public class BubbleSort {

    // compare an element to the next element
    // if its bigger swap position
    // keep repeating this process and bubble up the bigger number the end
    // now repeat the same process for rest of the elements
    // if for any iteration there is no swap then array is sorted break the loop
    public static void sort(int[] input, int start, int end) {
        for (int j = start; j <= end - 1; j++) {
            int flag = 0;
            for (int i = start; i <= end - 1; i++) {
                if (input[i] > input[i + 1]) {
                    Utility.swap(input, i, i+1);
                    flag =1;
                }
            }
            if(flag == 0){
                break;
            }
        }
    }

}
