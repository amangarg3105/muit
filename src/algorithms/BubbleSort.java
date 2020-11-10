package algorithms;


import java.util.Scanner;

public class BubbleSort {


    /**
     * 1. Run a loop i in  0 to n
     *     swap = false;
     * 2. Run a loop from 0 to n - i
     * 3.   take two elements for e.g 0-1 , 1-2, 2-3
     *  4.  compare these elements if they are already sorted
     *  5.  If not, swap them, swap = true
     * 6.  Keep doing above steps from 2 to 6
     *     if swap == false break outer loop
     * 7.  Keep doing above steps from 1 to 7
     * T.C - O(n^2)
     * S.C - O(1)
     * @param input
     */
    public static void sort(int [] input) {

        int n = input.length;
        for(int i = 0; i < n; i++) {
            boolean swap = false;
            for(int j = 0; j < n - i - 1; j++) {
                int firstElement = input[j];
                int secondElement = input[j + 1];
                if(firstElement > secondElement) {
                    swap(firstElement, secondElement, j, j + 1, input);
                    swap = true;
                }
            }
            if(swap == false) {
                break;
            }
        }
    }


    public static void swap(int firstElement, int secondElement, int i, int j, int[] input) {
            input[i] = secondElement;
            input[j] = firstElement;
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
