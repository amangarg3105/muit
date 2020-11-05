import java.util.Scanner;

/**
 * @author amgarg
 */
public class Loops {


    //Main function
    public static void main(String[] args) {


        //Print even numbers using while loop

    /*    int number = 1;

        while(number <= 100) {
            //Check for even number
            if(number % 2 == 0) {
                System.out.println("Number is even " + number);
            }
            System.out.println("Program is running");
           number++;
//            number += 1;
//            number = number + 1;
        }*/


        //Print even numbers using for loop
//        for (int number = 1; number <= 100; number += 2) {
//            if (number % 2 == 0) {
//                System.out.println("Number is even " + number);
//            }
//        }



        //Do while loop

        //Build wall

//        int brick = 101;
//        do {
//            System.out.println("Using brick number " + brick);
//            System.out.println("Building wall");
//            brick++;
//        } while (brick <= 100);




        boolean online = true;
        int messageSendingTimes = 0;

//        do {
//            System.out.println("Send message with Hi");
//            if (messageSendingTimes == 9) {
//
//            }
//        } while(online);


//        while(online) {
//            System.out.println("Send message with Hi");
//            messageSendingTimes++;
//            if(messageSendingTimes >= 9) {
//                online = false;
//                break;
//            }
//        }

        int currentFuel = 50;

        while (currentFuel > 0) {
            if(currentFuel <= 25) {
                System.out.println("Fill Up you tank again");
                currentFuel--;
                continue;
            }
            System.out.println("Keep Driving");
            currentFuel--;
        }

        Scanner scanner = new Scanner(System.in);
        //Created array
        int [] slots = new int[6];


        //Take the input for slot 0 only
        slots[0] = scanner.nextInt();
        slots[1] = scanner.nextInt();
        slots[2] = scanner.nextInt();
        slots[3] = scanner.nextInt();


         //6 iterations

        for(int index = 0; index < 6; index++) {
            int number = 5;
           slots[index] = scanner.nextInt(); //slots[1] = scanner.nextInt();
        }



        for(int printingIndex = 0; printingIndex < 6; printingIndex++) {
            System.out.print(slots[printingIndex] + " ");
        }


        while(true) {



            break;

        }




    }








}
