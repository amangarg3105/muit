package algorithms;


import java.util.Scanner;

public class LinearSearch {


    /**
     * 1. Run a loop over an array
     * 2. Take the current element, check with user's given element
     * 3. If matches, return index;
     * 4. else return -1;
     *
     * Time Complexity - O(n)
     * Space Complexity - O(1)
     * @param input
     * @return
     */
    static int elementExists(int [] input, int element) {
        for (int index = 0; index < input.length; index++) {
            int currentElement = input[index];
            if(currentElement == element) {
                return index;
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
