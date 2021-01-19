package dynamicprogramming;



public class CoinExchange {



    public static  int minCoinUsingRecursion(int [] denominations, int amount) { // 1 2 5, 0

        if(amount == 0) {
            return 0;
        }


        int finalAns = Integer.MAX_VALUE;

        for(int i = 0; i < denominations.length; i++) {
            int denominationAmount = denominations[i]; //1

            int remainingAmount = amount - denominationAmount;  //0

            if(remainingAmount >= 0) {

                int smallAns = minCoinUsingRecursion(denominations, remainingAmount); //x coins
                finalAns = Math.min(finalAns, smallAns + 1);  //x

            }

        }
        return finalAns;
    }

    public static int minCoinsUsingDynamicApproach(int [] denominations, int amount) {

        if(amount == 0) {
            return 0;
        }


        int [][] dpMemory = new int[amount + 1][denominations.length + 1];

        for(int i = 0; i <= amount; i++) {
                dpMemory[i][0]  = i;
        }


       for(int i = 1; i <= denominations.length; i++) {
           for(int j = 1; j <= amount; j++) {
               if(denominations[i - 1] <= j) {
                   int remainingAmount = j - denominations[i - 1]; //4
                   int pastCoins = dpMemory[remainingAmount][i];
                   int minTotalCoins = 1 + pastCoins; //1
                   int excludeCurrentDenominationMinCoins = dpMemory[j][i - 1]; //0
                   dpMemory[j][i] = Math.min(minTotalCoins, excludeCurrentDenominationMinCoins);
               } else {
                   dpMemory[j][i] = dpMemory[j][i-1];
               }
           }
       }


        for(int i = 0; i <= amount; i++) {
            for (int j = 0; j <= denominations.length; j++) {

                System.out.print(dpMemory[i][j] + "   ");
            }
            System.out.println();
        }
       return dpMemory[amount][denominations.length];
    }



    public static void main(String[] args) {

        int [] denominations = {1, 2, 5};
        int amount = 8;
        int minCoinsNeeded = minCoinUsingRecursion(denominations, amount);


        System.out.println(minCoinsNeeded);

      //  minCoinsNeeded = minCoinsUsingDynamicApproach(denominations, amount);

     //   System.out.println(minCoinsNeeded);

    }
}
