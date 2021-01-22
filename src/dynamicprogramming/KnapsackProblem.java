package dynamicprogramming;


public class KnapsackProblem {


    public static int maxProfit(int [] wts, int [] val, int N, int W) {

        if(N == 0 || W == 0) {
            return  0;
        }

        int pick = 0;
        int dont_pick = 0;

        if(wts[N - 1] <= W) {
            int remainingCapacity = W - wts[N - 1];
            pick = val[N - 1] + maxProfit(wts, val, N - 1, remainingCapacity);
        } else {
            dont_pick = 0 + maxProfit(wts, val,  N - 1, W);
        }

        int maxProfit = Math.max(pick, dont_pick);
        return  maxProfit;
    }

    public static int maxProfitUsingDynamicApproach(int [] wts, int [] val, int N, int W) {

        int dpMemory [][] = new int[N + 1][W + 1];


        for(int i = 1; i < dpMemory.length; i++) {
            for(int j = 1; j < dpMemory[0].length; j++) { //j is current weight

                if(j >= wts[i - 1]) {

                    int pickItemProfit = 0;
                    int notPickItemProfit = 0;

                    int remainingCapacity = j - wts[i - 1];

                     pickItemProfit = val[i - 1] + dpMemory[i - 1][remainingCapacity];

                    notPickItemProfit = dpMemory[i - 1][j];

                    dpMemory[i][j] = Math.max(pickItemProfit, notPickItemProfit);

                } else {
                    //don't pick
                    dpMemory[i][j] = dpMemory[i-1][j];
                }
            }
        }


        for(int i = 0; i < dpMemory.length; i++) {
            for(int j = 0; j < dpMemory[0].length; j++) {
                System.out.print(dpMemory[i][j] + "  ");
            }
            System.out.println();
        }

        return dpMemory[N][W];

    }




    public static void main(String[] args) {

        int [] wts = {2, 1, 3, 2};
        int values [] = {12, 10, 21, 15};

        int size = 8;

        int maxProfit = maxProfitUsingDynamicApproach(wts, values, wts.length, size);

        System.out.println(maxProfit);
    }
}
