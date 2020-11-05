
import java.io.*;
import java.util.Scanner;

public class Functions {

    public static void main(String[] args) throws IOException {

        int [] learners = {1, 2, 3, 4 ,5, 6, 7};

        for(int i = 0; i < 7; i++) {

        }

        String userName = "Aman Garg";

        System.out.println(userName.charAt(8));

        System.out.println(userName.length());

       printId(1, "Aman");

       System.out.println("Flow is done");

       int a = 1;
       int b = 2;

       System.out.println(a + " " + b);
       passByValue(a, b);
       System.out.println(a + " " + b);


       int value = -9;
       int value2 = 10;

     int absValue = Math.max(value, value2);

       System.out.println(absValue);


       String s1 = "";
       String s2 = "String";

       if(s1.equalsIgnoreCase(s2)) {
           System.out.println("Equal");
       } else {
           System.out.println(" Not Equal");
       }

       String s3 = s1.concat(s2);


       System.out.println(s3);



    }


    public static void passByValue(int a, int b) {
        //int a = 1; // int b = 2
        a = 2;
        b = 1;
        System.out.println(a + " " + b);
    }


    public static void printId(int userId, String userName) {  //int userId = 1;
        System.out.println(userName);
        System.out.println("Print the userId who is opening the jar " + userId);
        if(userId != 7) {
            boolean isJarOpened = openJar(userId); //output from openJar
            System.out.println(isJarOpened);
            return;
        }
        System.out.println("Jar is not opened");
    }



    public static boolean openJar(int userId) { //int userId = 1
        if(userId != 7) {
            System.out.println("Hold the jar in one hand");
            System.out.println("Put your other hand on the lid");
            System.out.println("Rotate the lid anti clockwise");
            return true;
        }
        System.out.println("Jar is not opened");
        return true;
    }

    public static void readFile() throws IOException {
       File input = new File("/Users/amgarg/Desktop/File.txt");
        Scanner sc = new Scanner(input);
        String line = sc.nextLine();
        System.out.println(line);

        FileWriter fileWriter = new FileWriter("/Users/amgarg/Desktop/File.txt");
        fileWriter.write("This is another line");
        fileWriter.close();

    }
}
