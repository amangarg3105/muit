import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(a);
        // readFile();

//        int a[] = new int[5];
//
//        System.out.println(a[10]);

        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
//            int a[] = new int[5];
//            System.out.println(a[10]);
            int exp = 67 / 0;
        } catch (Exception e) {
            System.out.println("User please correct the input");
        }
        System.out.println("Proceeding further");

        try {
            writeFile();
            System.out.println("File Modified");
        } catch (Exception e) {
            System.out.println("Write file is throwing exception, Please correct it");
        }

    }

    public static void writeFile() throws Exception {
        FileWriter fileWriter = new FileWriter("/Users/amgarg/Desktop/File.txt");
        fileWriter.write("This is another line");
        fileWriter.close();
    }


    public static void readFile() throws FileNotFoundException {
        File input = new File("/Users/amgarg/Desktop/File.txt");

        Scanner sc = new Scanner(input);



        while (sc.hasNext()) {
            String word = sc.next();
            System.out.println(word);
        }


        // System.out.println(line);


    }


}
