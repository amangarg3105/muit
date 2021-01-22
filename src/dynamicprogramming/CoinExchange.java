package dynamicprogramming;


public class CoinExchange {


    public static int minCoinUsingRecursion(int[] denominations, int amount) { // 1 2 5, 0

        if (amount == 0) {
            return 0;
        }


        int finalAns = Integer.MAX_VALUE;

        for (int i = 0; i < denominations.length; i++) {
            int denominationAmount = denominations[i]; //1

            int remainingAmount = amount - denominationAmount;  //0

            if (remainingAmount >= 0) {

                int smallAns = minCoinUsingRecursion(denominations, remainingAmount); //x coins
                finalAns = Math.min(finalAns, smallAns + 1);  //x

            }

        }
        return finalAns;
    }

    public static int minCoinsUsingDynamicApproach(int[] denominations, int amount) {

        if (amount == 0) {
            return 0;
        }

        int dpMemory[][] = new int[amount + 1][denominations.length + 1];

        for (int i = 0; i <= amount; i++) {

            dpMemory[i][0] = i;
        }


        for (int i = 1; i <= amount; i++) {
            for (int j = 1; j <= denominations.length; j++) {

                if (denominations[j - 1] <= i) {
                    int remainingAmount = i - denominations[j - 1]; //0
                    int pastCoins = dpMemory[remainingAmount][j];

                    int considerCurrentCoin = 1 + pastCoins;
                    int notConsideringCurrentCoin = dpMemory[i][j - 1];

                    int minCoins = Math.min(considerCurrentCoin, notConsideringCurrentCoin);

                    dpMemory[i][j] = minCoins;
                } else {
                    dpMemory[i][j] = dpMemory[i][j - 1];
                }
            }
        }


        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j <= denominations.length; j++) {
                System.out.print(dpMemory[i][j] + "    ");
            }

            System.out.println();

        }


        System.out.println("Show Coins");
        showCoinsUsed(dpMemory, denominations);


        System.out.println("Min Coins");
        return dpMemory[amount][denominations.length];

    }


    public static int minCoinsUsingDynamicApproachMoreOptimized(int[] denominations, int amount) {

        int dpMemory[] = new int[amount + 1];



        for(int i = 0; i < dpMemory.length; i++) {
            dpMemory[i] = i;
        }


        for(int i = 1; i <= amount; i++) {   // 14

            for(int j = 0; j < denominations.length; j++) { //

                int currentCoinDenominationValue = denominations[j];
                int currentAmount = i;

                if(currentCoinDenominationValue <= currentAmount) {

                    int remainingAmount = currentAmount - currentCoinDenominationValue;
                    int pastCoins = dpMemory[remainingAmount];

                    int considerCurrentCoin = 1 + pastCoins;

                    if(considerCurrentCoin != Integer.MAX_VALUE) {
                        int notConsideringCurrentCoin = dpMemory[i];
                        dpMemory[i] = Math.min(considerCurrentCoin, notConsideringCurrentCoin);
                    }

                }
             }
        }

        return dpMemory[amount];
    }










    private static void showCoinsUsed(int[][] dpMemory, int[] denominations) {

        int i = dpMemory.length - 1;
        int j = dpMemory[0].length - 1;
        while (j > 0 && i > 0) {
            if (dpMemory[i][j] == dpMemory[i][j - 1]) {
                j = j - 1;
            }
            else{
                System.out.println("Picked coin  :" + denominations[j - 1]);
                i = i - denominations[j - 1]; //remainingAmount
            }
        }

        while (i > 0) {
            System.out.println("Picked coin  :" + denominations[0]);
            i = i - 1;
        }
    }


    public static void main(String[] args) {

        int[] denominations = {1, 2, 5};
        int amount = 8;
        int minCoinsNeeded = minCoinsUsingDynamicApproachMoreOptimized(denominations, amount);


        System.out.println(minCoinsNeeded);
//
//        minCoinsNeeded = minCoinUsingRecursion(denominations, amount);
//
//        System.out.println(minCoinsNeeded);

    }
}
