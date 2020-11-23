package algorithms;

import java.util.Scanner;

/**
 * @author amgarg
 */
public class MergeSort {


    /**
     * Divide the input array into two parts
     * sort(left) recursively
     * sort(right) recursively
     * Merge left and right array into input array
     * Time Complexity - O(n log n)
     * Space Complexity - O(n)
     * @param input
     */
    static void sort(int [] input) {

        if(input.length == 1) {
            return;
        }

        int mid = input.length / 2;
        int n = input.length;

        int left[] = new int[mid];
        int right[] = new int[n - mid];

        for(int i = 0; i < left.length; i++) {
            left[i] = input[i];
        }

        for(int i = 0; i < right.length; i++) {
            right[i] = input[i + mid]; //right[2] = input[4]
        }

        sort(left);
        sort(right);

        mergeTwoSortedArrays(left, right, input);


    }

    /**
     * 1. Initialize three pointers l = 0, r = 0, k = 0
     * 2. run a loop till l < left.length && r < right.length
     * 3 .Compare left[l] and right [r]
     *    3.1 if (left[l] < right[r]) {
     *     resultArray[k] = left[l]
     *     k++, l++;
     * } else {
     *     resultArray[k] = right[r]
     *          k++, r++;
     * }
     * 4. Repeats steps from 2 to 4
     * 5. Run a loop starting from l < left.length {
     *      resultArray[k] = left[l]
     *           k++, l++;
     * }
     * 6. Run a loop starting from r < right.length {
     *      resultArray[k] = right[r]
     *               k++, r++;
     * }
     *
     * 7. We have a sorted(Ascending)  resultant array
     *
     *
     * T.C - O(n)
     * S.C - O(1)
     *
     *
     *
     *
     * @param left
     * @param right
     * @param arr
     */

    static void mergeTwoSortedArrays(int [] left, int [] right, int [] arr) {

        int l = 0, r = 0, k = 0;

        while (l < left.length && r < right.length) {
            if(left[l] <= right[r]) {
                arr[k] = left[l];
                k++;
                l++;
            } else {
                arr[k] = right[r];
                k++;
                r++;
            }
        }

        while(l < left.length) {
            arr[k] = left[l];
            k++;
            l++;
        }

        while (r < right.length) {
            arr[k] = right[r];
            k++;
            r++;
        }

    }


    public static void printArray(int [] input) {
        for(int element  : input) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the size of the array");
        int size = scanner.nextInt();

        int input[] = new int[size];

        //Take the input from user to add in array

        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }

        printArray(input);
        sort(input);
        System.out.println("Sorted Array is");
        printArray(input);
    }
}
