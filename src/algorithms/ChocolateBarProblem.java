package algorithms;


import java.util.Scanner;

public class ChocolateBarProblem {


    /**
     * 1. Take one window, making sure that window
     *        size is less than equals to birthday month
     *
     * 2. Add elements in this window
     *
     * 3. Once the window's size == birthday month
     *      calculate sum of elements present in this window
     *        if sum  == date  -> ans = ans + 1;
     *
     * 4. If windowSize > birthMonth
     *  remove the elements from start of this window and reduce the sum also
     *  until it windowsize become birthMonth.
     * @param input
     * @param month
     * @param date
     * @return
     */
    static int solution(int[] input, int month, int date) {

        int windowSize = 0;
        int sum = 0;
        int start  = 0;
        int ans  = 0;

        for(int i = 0; i < input.length; i++) {

            if(windowSize <= month) {
                sum = sum + input[i];
                windowSize++;
            }

            while(windowSize > month) {
                sum = sum - input[start];
                start++;
                windowSize--;
            }

            if(windowSize == month && sum == date) {
                ans = ans + 1;
            }
        }
        return  ans;
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
        System.out.println("Please provide the month number");

        int monthNumber = scanner.nextInt();
        System.out.println("Please provide the date number");
        int date = scanner.nextInt();

        int solution = solution(input, monthNumber, date);

        System.out.println(solution);


    }
}
