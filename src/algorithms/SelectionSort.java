package algorithms;


import java.util.Scanner;

public class SelectionSort {

    /**
     * 1. Run a loop currentElement 0 to n - 2
     * 2. Assume currentIndex is minimumIndex
     * 3. find the minimum from currentIndex + 1 to n
     *    3.1 if any element is less than input[minimumIndex] //Minimum element
     * 4. Once we got minimum swap it with current element
     * 5. Repeat steps 1 to 4
     * @param input
     *
     * T.C = O(n^2)
     * S.C = O(1)
     */
    static void sort(int[] input) {
        int n = input.length;
        int minIndex = -1;
        for(int i = 0; i < n - 1; i++ ) {
            minIndex = i;
            for(int j = i + 1; j < n; j++) {
                if(input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            int currentElement = input[i];
            int minimumElement = input[minIndex];
            swap(currentElement, minimumElement, i, minIndex, input); // O(1)
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
