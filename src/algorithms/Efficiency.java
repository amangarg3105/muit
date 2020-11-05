package algorithms;


import java.util.LinkedList;
import java.util.Scanner;

public class Efficiency {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


       /* for(int i = 0; i < n; i++) {  //O(n)
            for(int j = 0; j < n; j++) {
                System.out.println("Hello");
                break;
            }
        }*/


      /*  for(int i = 0;i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.println("Hello");
            }
        }*/


      //O(log n)
        /*for(int i = 1; i < n; i = i*2) {
                System.out.println("Hello");
        }*/


        int p = 0;
        for(int i = 1; p <= n; i++) {
            p = p+i;
        }



        for(int i = 0; i < n; i++) { // O(n)
            for(int j = 1; j < n; j = j*2) { //O(log n)
                System.out.println("Hello"); // O(1)
            }
        }


        for(int i = 0;  i < n; i++) {
            System.out.println("Hello");
        }
        int m = scanner.nextInt();

        for(int i = 0;  i < n; i++) { //O(n)
            for(int j = 0; j < 10; j++) { //O(n)
                System.out.println("Hello");
            }
        }


    }










}
