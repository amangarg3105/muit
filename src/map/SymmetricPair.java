package map;



import java.util.HashMap;
import java.util.Scanner;



public class SymmetricPair {


    /**
     * 0. Create HashMap
     * 1. Iterate over the input array
     * 2. take current pair
     * 3. check second value of current pair exists in key col. of hash map or not
     *  3.1 if not -> then put the pair in hashmap
     *  3.2 if exists -> get value against the matched key and compare it with the first value
     *     of current pair
     *      3.2.1 If matches print the pair
     *      3.2.2 if not, then move ahead to next pair.
     *
     *
     *
     * T.C - O(n)
     * S.C - O(n)
     * @param input
     */
    public static void printPair(int [][] input) {


        HashMap<Integer, Integer> map =
                new HashMap<>();

        for (int index = 0; index < input.length; index++) {

            int firstValue = input[index][0];
            int secondValue = input[index][1];
            if(map.containsKey(secondValue)) {
                int value = map.get(secondValue);
                if(value == firstValue) {
                    System.out.println("Pair Exists at Index " + index);
                    System.out.println(firstValue + "  " + secondValue);
                }
            } else {
                map.put(firstValue, secondValue);
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int pairCount = sc.nextInt();

        int[][] input = new int[pairCount][2];

        for(int i = 0; i < pairCount; i++) {
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();
            input[i][0] = firstNumber;
            input[i][1] = secondNumber;
        }

        printPair(input);



    }
}
