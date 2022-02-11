public class SelectionSort {

    public static void sort(int[] input, int start, int end) {
        for (int i = 0; i <= end - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < end; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            swap(input, i, minIndex);
        }
    }

    public static void swap(int[] input, int i, int minIndex) {
        int temp = input[i];
        input[i] = input[minIndex];
        input[minIndex] = temp;
    }
}
