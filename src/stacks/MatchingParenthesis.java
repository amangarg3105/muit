package stacks;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MatchingParenthesis {


    /**
     * 1. Create a stack
     * 2. Iterate over the string
     *    2.1 take the current element and check it's opening {
     *        push the closing bracket corresponding to opening one  in stack
     *    } else {
     *         pop the element from stack, check it with current element
     *         if(popped element != currentElement) {
     *             return false;
     *         }
     *    }
     *
     *    if(stack.isEmpty) {
     *        return true;
     *    } else {
     *        return false;
     *    }
     *
     *
     *
     * @param str
     * @return
     */
    static  boolean isMatching(String str) {

        Stack<Character> s = new Stack();

        for(int i = 0; i < str.length(); i++) {
            char currentCharacter = str.charAt(i);  //a[0]
            if(currentCharacter == '(') {
                s.push(')');
            } else if (currentCharacter == '{') {
                s.push('}');
            }
            else {
                if(s.isEmpty()) {
                    return false;
                }
                char poppedCharacter = s.pop();
                if(poppedCharacter != currentCharacter) {
                    return false;
                }
            }
        }
        if(s.isEmpty()) {
            return true;
        } else {
            return false;
        }
   }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please provide the expression");

        String exp = s.nextLine();

        boolean isMatching = isMatching(exp);

        System.out.println(isMatching);
    }
}
