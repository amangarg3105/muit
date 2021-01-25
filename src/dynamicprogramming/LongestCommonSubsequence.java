package dynamicprogramming;


public class LongestCommonSubsequence {

    //Recursion + memoziation
    public static int lcs(String s1, String s2, int [][] dp) {


        if(s1.length() == 0 || s2.length() == 0) {
            return 0;
        }

        if(dp[s1.length()][s2.length()] > 0) {
            return dp[s1.length()][s2.length()];
        }

        if(s1.charAt(0) == s2.charAt(0)) {
            dp[s1.length()][s2.length()] = lcs(s1.substring(1), s2.substring(1), dp) + 1;
        } else {
            int op1 = lcs(s1, s2.substring(1), dp);
            int op2 = lcs(s1.substring(1), s2, dp);
            dp[s1.length()][s2.length()] = Math.max(op1, op2);
        }
        return dp[s1.length()][s2.length()];
    }


    public static int lcsUsingDynamicApproach(String s1, String s2) {

        if(s1.length() == 0 || s2.length() == 0) {
            return 0;
        }

        int dp[][] = new int[s1.length() + 1][s2.length()+ 1];

        for(int i = dp.length - 2; i >= 0; i--) {
            for(int j = dp[0].length - 2; j >=0; j--) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    dp[i][j] = dp[i + 1][j + 1] + 1;
                 } else {
                    int op1 = dp[i + 1][j];
                    int op2 = dp[i][j + 1];
                    dp[i][j] = Math.max(op1, op2);
                }
            }
        }

        return dp[0][0];

    }





    public static void main(String[] args) {

        String s1 = "abgei";
        String s2 = "adegi";

        int [][] dp = new int[s1.length() + 1][s2.length() + 1];

        System.out.println(lcsUsingDynamicApproach(s1, s2));
    }

}
