package recursion;


import java.util.ArrayList;
import java.util.List;

public class PrintKeypadCombinations {


    public static String getValue(char c) {

        if(c == '2') {
            return "abc";
        }
        if(c == '3') {
            return "def";
        }

        return "";
    }

    public static ArrayList<String> getAllCombinations(String input) { // 23


        if(input.length() == 0) {
            ArrayList<String> baseOutput = new ArrayList<>();
            String emptyString = "";
            baseOutput.add(emptyString);
            return baseOutput;
        }


        //This is the first character of input String
        String firstCharacterValue = getValue(input.charAt(0)); // ""


        ArrayList<String> nextStringCombinations = getAllCombinations(input.substring(1)); //for input is 3,
        // ans is empty list

        ArrayList<String> biggerProblemCombinations = new ArrayList<>(); //


        for(int i = 0; i < firstCharacterValue.length(); i++) {
            for(int j = 0; j < nextStringCombinations.size(); j++) {
                String output = firstCharacterValue.charAt(i) + nextStringCombinations.get(j);
                biggerProblemCombinations.add(output);
            }
        }

        return biggerProblemCombinations;

    }

    public static void main(String[] args) {

        ArrayList<String> ans = getAllCombinations("2323");

        for(String s : ans) {
            System.out.println(s);
        }
    }
}
