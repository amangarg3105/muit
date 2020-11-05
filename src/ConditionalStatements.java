import java.util.Scanner;

public class ConditionalStatements {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        /*int path_One_Roadblocks = sc.nextInt();
        int path_Two_Roadblocks = sc.nextInt();

        if (path_One_Roadblocks > path_Two_Roadblocks) {
            System.out.println("Please go for path two");
            System.out.println("Please go for path two");
        }
         else
            System.out.println("Please go for path one");

*/
        int data = 100;

       int data2 = data++;

        System.out.println(data2);
        System.out.println(data);


       System.out.println(data++);
//
//        System.out.println(data);


        String subject = sc.nextLine();

        int studentMarks = sc.nextInt();

        String gender = sc.next();

        System.out.println("Enter Input" );

        int input = sc.nextInt();

        System.out.println("Your input is " + input);


        //Check the position of this student using student marks

        //91 - 100
        switch (subject) {
            case "Physics":
            case "Maths":
                //95
                if (studentMarks > 90 && studentMarks <= 100) {
                    System.out.println("First Position");
                    if (gender.equalsIgnoreCase("Male")) {
                        System.out.println("You will get psp4");
                    } else if (gender.equalsIgnoreCase("female")) {
                        System.out.println("You will get makeup and whatever you want");
                    }
                } else if (studentMarks > 70 && studentMarks <= 90) {
                    System.out.println("Second Position");
                }  else if (studentMarks > 40 && studentMarks <= 70) {
                    System.out.println("Third Position");
                } else {
                    System.out.println("Please try again");
                }
                break;
            case "Chemistry":
                System.out.println("We will have prize distribution/ position allocation for this subject later");
                break;
            default:
                System.out.println("Please choose any practical and interesting subject");
        }

        System.out.println("I don't know which condition executed");

    }
}
