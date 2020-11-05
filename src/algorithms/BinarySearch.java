package algorithms;


import java.util.Scanner;

public class BinarySearch {

    /**
     * 1. Initialize start = 0 and end = array.length - 1;
     * 2. Run a loop starting from start till it becomes equals to end
     * 3. Find middle element using start and end
     * 4. Compare middle element of an array with searched key
     *   4.1 if mid == key, we found the element, return or break
     *   4.2 if mid > key, make end = mid - 1;
     *   4.3 else, make start = mid + 1;
     * 5. Repeat steps from 2 to 5
     * 6. If nothing from above steps, return -1;
     *
     * T.C - O(log n)
     * S.c - O(1)
      * @param arr
     * @param k
     * @return
     */

    //Iterative binary search
    static int elementExists(int [] arr, int k) {
       int start = 0;
       int end = arr.length - 1;

       while(start <= end) {

           int midIndex = (start + end) / 2;

           int middleElement = arr[midIndex];

           if(middleElement == k) {
               return midIndex;
           }

           if(middleElement > k) {
               end = midIndex - 1;
           } else {
               start = midIndex + 1;
           }
       }
       return -1;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the size of the array");
        int size = scanner.nextInt();

        int input [] = new int[size];

        //Take the input from user to add in array

        for(int i= 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }

        System.out.println("Please provide the search key");

        int key = scanner.nextInt();

        int position = elementExists(input, key);

        System.out.println(position);

    }
}
