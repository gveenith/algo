//import java.util.Arrays;

public class MergeSort {

    // D&C stratergy - keep dividing the array (BFS) till its a single element on
    // left and right sub tree
    // then call compare and merge
    public static void sort(int[] input, int end) {
        // System.out.println("input :"+ Arrays.toString(input)+ " start :"+ start + "
        // end :"+ end);

        if (end <= 1) {
            return;
        }

        int mid = end / 2;
        // System.out.println("mid "+ mid);
        int[] leftArray = new int[mid];
        int[] rightArray = new int[end - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = input[i];
        }
        // System.out.println("Left "+ Arrays.toString(leftArray));

        for (int j = mid; j < end; j++) {
            rightArray[j - mid] = input[j];
        }
        // System.out.println("Right "+ Arrays.toString(rightArray));

        sort(leftArray, leftArray.length);
        sort(rightArray, rightArray.length);
        compareAndMerge(leftArray, rightArray, input);

    }

    // initate 3 pointers for three arrays
    // loops each array till the end and start comparing L and R pointers from start
    // move smallest number to input array and increment corresponding pointer
    // repeat the process and at the end fill remaining elements from array
    public static void compareAndMerge(int[] leftArray, int[] rightArray, int[] input) {

        int leftPointer = 0, rightPointer = 0, inputPointer = 0;
        while (leftPointer < leftArray.length && rightPointer < rightArray.length) {
            if (leftArray[leftPointer] < rightArray[rightPointer]) {
                input[inputPointer] = leftArray[leftPointer];
                leftPointer++;
            } else {
                input[inputPointer] = rightArray[rightPointer];
                rightPointer++;
            }
            inputPointer++;
        }
        while (leftPointer < leftArray.length) {
            input[inputPointer] = leftArray[leftPointer];
            leftPointer++;
            inputPointer++;

        }
        while (rightPointer < rightArray.length) {
            input[inputPointer] = rightArray[rightPointer];
            rightPointer++;
            inputPointer++;
        }

        // System.out.println("compareAndMerge :"+ Arrays.toString(input));
    }

}
