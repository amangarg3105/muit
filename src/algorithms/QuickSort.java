package algorithms;


import java.util.Scanner;

public class QuickSort {



    static void sort(int [] input) {

        quickSort(input, 0, input.length - 1);

    }

    /*

     */
    public static void quickSort(int[] ar, int start, int end) {

        if(start >= end) {
            return;
        }
        int pivotIndex = findPivot(ar, start, end);
        quickSort(ar, start, pivotIndex - 1);
        quickSort(ar, pivotIndex + 1, end);
    }



        /**
         * n = size of array
         * Consider pivot as last element
         * Initialize pivotIndex = 0, and index = 0;
         * Run a loop starting from 0 to n - 2 (Inclusive) {
         *     compare (a[index] <= pivot) {
         *         swap(a[index], a[pivotIndex])
         *         pivotIndex++;
         *     }
         *
         *     swap(a[pivotIndex], pivot)
         * }
         *
         * T.C - O(n)
         * @param input
         * @return
         */

    static int findPivot(int [] input, int start, int end) { //0 // n -1
        int pivot = input[end];
        int pivotIndex = start;
        for(int index = start; index < end; index++) {
            if(input[index] <= pivot) {
                int temp1 = input[pivotIndex];
                input[pivotIndex] = input[index];
                input[index] = temp1;
                pivotIndex++;
            }
        }
        int temp1 = input[pivotIndex];
        input[pivotIndex] = pivot;
        input[end] = temp1;
        return  pivotIndex;
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
