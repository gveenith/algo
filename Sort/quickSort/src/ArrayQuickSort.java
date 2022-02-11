
public class ArrayQuickSort {

    // D&C - take middle element as pivot and find partition index
    // partition index - Take Left pointer and Right pointer and compare it with
    // pivot till
    // LP is smaller than pivot and RP is larger than pivot. swap the positions, inc
    // and dec pointers
    // repeat till LP and RP meet, now pivot is in place.
    // divide the array into Left array [till leftP]and right array [from rightP]and
    // repeat the process
    // TC: Worst: O(n square) avg & best : O(nlogn)
    // space: O(n

    public static void sort(int[] input, int start, int end) {
        if (input.length <= 0) {
            return;
        }
        partition(input, start, end);
    }

    public static void partition(int[] input, int start, int end) {

        if(start>=end)return;

        int pivot = input[(start + end)/2];
        int leftP = start, rightP = end;

        while(leftP <= rightP){
        while(leftP <= rightP && input[leftP] < pivot) {leftP++;}
        while(leftP <= rightP && input[rightP] > pivot) {rightP--;}

        if(leftP <= rightP){
            Utility.swap(input, leftP, rightP);
            leftP++;
            rightP--;

        }

    }


    partition(input, start, rightP);
    partition(input, leftP, end);
       
    }

}
