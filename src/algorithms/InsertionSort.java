package algorithms;

import java.util.Scanner;

/**
 * @author amgarg
 */
public class InsertionSort {

    /**
     * Run a loop from 1 to n-1 //inclusive
     * currentElement = array[i];
     * previousIndex = i;
     * while(previousIndex > 0 && currentElement < array[previousIndex-1]) {
     *     array[previousIndex] = array[previousIndex-1];
     *     previousIndex = previousIndex - 1;
     *}
     *array[previousIndex] = currentElement;
     *
     * S.C - O(1)
     * T.C - O(n^2)
     *  In best case - T.C - O(n)
     * @param input
     */
    static void sort(int [] input) {
        int n = input.length;
        for (int i = 1; i <= n - 1; i++) { // N -1 times
            int currentElement = input[i];
            int previousIndex = i;
            while (previousIndex > 0 && currentElement < input[previousIndex - 1]) {
                input[previousIndex] = input[previousIndex - 1]; // constant
                previousIndex = previousIndex - 1; // constant
            }
            input[previousIndex] = currentElement;
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
