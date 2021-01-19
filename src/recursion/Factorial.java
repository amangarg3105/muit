package recursion;


public class Factorial {


    public static int fact(int n) {
        if(n == 1) {
            return 1;
        }

        int smallerAns = fact(n -1); //24 for n = 5

        int biggerAns = smallerAns * n; // 24 * 5

        return biggerAns; //120

    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }

}
