import java.util.Scanner;

/**
 * @author amgarg
 */
public class DataTypes {

    public static void main(String[] args) {


//        int a = 40;
//
//        int b = 51;
//
//        double average = ((double) a + (double) b) / 2;




        //Automatic casting

        int number = 532;

        long longNumber = number;

        byte byteNumber = (byte) number;

        System.out.println(byteNumber);

        //Explicit casting

        //System.out.println(average);

//        char c = 'a';

        //Automatic Casting
       // int character = c;

        char x = 'a';

        char v = 'b';


       //Set of characters
        String firstName = "Aman";
        String lastName = "Garg";

        System.out.println(firstName + " " + lastName);

        System.out.println("My first Name is " + firstName);




      //  System.out.println(character);


        //Arrays



        int [] students;

        students = new int[3];




        int hundred = 100;

        int twoDigitNumber = 15;

        boolean result = twoDigitNumber != hundred;




        System.out.println(result);

        /*
        Check if student have scored 100 marks within the group,
         If yes, make it true and compare it with groups

         */
        int student1 = 100;
        int student2 = 100;

        int student3 = 95;
        int student4 = 98;


      //  This is to check the marks of student1 and student2 are equal or not


        boolean group1 = (student1 == student2);

        boolean group2 = (student3 == student4);


        boolean overrall = group2 && group1;
        System.out.println(overrall);

        boolean trueValue = false;

        trueValue = !trueValue;

        System.out.println(trueValue);

        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean evaluation = a || b && ! c;

        System.out.println(evaluation);


        int[] students_new = new int[3];


        students_new[0] = 100;

        students_new[1] = 95;

        students_new[2] = 83;



        //Printing fourth slot
        System.out.println(students_new[2]);


        int runner1 = 25;
        int runner2 = 50;



        int diff = runner2 - runner1;

        int diffResult = diff * 2;


        System.out.println(diffResult);

        String tempString = "abc";

        String resultString = "abc" + 13;

        System.out.println(resultString);

       // int [] array = new int[6];

        int [] array = {1 ,2 ,3};


        //and = &&
        // or = ||

        //not = !





    }
}
