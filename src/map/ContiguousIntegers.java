package map;


import java.util.HashSet;
import java.util.Scanner;

/**
 *
 */
public class ContiguousIntegers {



    public  static boolean checkCounting(int [] input) {


        HashSet<Integer> set = new HashSet<>();

        for(int element : input) {
            set.add(element);
        }

        int currentElement = input[0];

        int rangeCount = 0;

        while(set.contains(currentElement)) {
            rangeCount++;
            currentElement--;
        }

        currentElement = input[0] + 1;

        while(set.contains(currentElement)) {
            rangeCount++;
            currentElement++;
        }

        if(rangeCount == set.size()) {
            return true;
        }
        return false;

    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int input[] = new int[size];

        //Take the input from user to add in array

        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }

        boolean result = checkCounting(input);

        System.out.println(result);




    }
}
