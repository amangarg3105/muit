package dynamicprogramming;


public class NFibonnacciNumber {



    //2^n
    public static int fibonacciUsingRecursion(int n) {
        if (n < 2)
            return n;

        int smallOutput1 = fibonacciUsingRecursion(n - 1);
        int smallOutput2 = fibonacciUsingRecursion(n - 2);

        return (smallOutput1 + smallOutput2);
    }




    //recursion.Recursion + memoziation
    //TC - O(N)
    //SC - O(n)
    public static int topDownFib(int n, int dpMemory[]) {

        //Base Case
        if(n == 0 || n == 1) {
            dpMemory[n] = n;
            return n;
        }

        //Ask Past
        if(dpMemory[n] != -1) {
            return dpMemory[n];
        }

        int smallOutput1 = topDownFib(n - 1, dpMemory);
        int smallOutput2 = topDownFib(n - 2, dpMemory);

        dpMemory[n] = smallOutput1 + smallOutput2;

        return dpMemory[n];

    }


    //TC - O(N)
    //SC - O(n)


    public static int bottomUp(int n) {
        int dpMemory[] = new int[n + 1];

        dpMemory[0] = 0;
        dpMemory[1] = 1;

        for(int i = 2; i <=n;  i++) {
            dpMemory[i] = dpMemory[i - 1] + dpMemory [i - 2];
        }
        return dpMemory[n];
    }








    public static void main(String[] args) {


        int [] dp = new int[101];
        for(int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

       long startTime = System.currentTimeMillis();
       int ans =  topDownFib(100, dp);
       long endTime = System.currentTimeMillis();


       System.out.println(ans + "  " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        ans = bottomUp(100);
        endTime = System.currentTimeMillis();


       System.out.println(ans + "  " + (endTime - startTime));


    }


}
