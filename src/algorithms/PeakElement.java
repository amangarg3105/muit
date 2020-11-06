package algorithms;


import java.util.Scanner;

/**
 * 1. Run a loop from starting till end
 * 2. calculate mid using start and end
 * 3. check if a[mid] < a[mid + 1] start = mid + 1
 * 4. end = mid
 * 5. Keep doing 1 to 5 steps until you have one element
 * 6. return start
 */

//T.C - O(log n)
//S.C - O(1)
public class PeakElement {

    static int peakElement(int [] arr) {

        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = (start + end) / 2;
            if(arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
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

        int peakIndex = peakElement(input);
        System.out.println(input[peakIndex]);
    }
}
