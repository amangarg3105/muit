package algorithms;


import java.util.Scanner;

public class KSmallestElements {

    /**
     * Assuming first k element are always minimum maintaining order
     *
     * Run a loop starting from k to n-1 (both are inclusive) {
     * take currentElement
     *
     * Find max ele in 0..k-1 window (inclusive)
     *   Run a backward loop from k - 2 to 0 (inclusive)
     *     find the max element, and store the index of it also
     *
     * If(max > current) {
     *     Run a loop forward direction starting maxIndex till k - 1 ( exclusive)
     *     input[currentPosition] = input[currentPosition + 1]
     * }
     *   input[k -1] = currentElement
     *}
     *
     * T.C -O(kn)
     *
     * @param input
     */
    static void KSmallestElements(int [] input, int k) {
        int n = input.length;
        for(int i = k; i <= n - 1; i++) {
            int currentElement = input[i];
            int maximum_element = input[k - 1];
            int maxElemenPosition = k - 1;

            for(int j = k - 2; j >= 0; j--) {
                if(input[j] > maximum_element) {
                    maximum_element = input[j];
                    maxElemenPosition = j;
                }
            }
            if(maximum_element > currentElement) {
                while(maxElemenPosition < k -1) {
                    input[maxElemenPosition] = input[maxElemenPosition + 1];
                    maxElemenPosition++;
                }
                input[k-1] = currentElement;
            }
        }

        for(int i = 0; i < k; i++) {
            System.out.println(input[i]);
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

        int k = scanner.nextInt();
        KSmallestElements(input, k);

    }
}
