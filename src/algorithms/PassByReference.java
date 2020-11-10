package algorithms;


public class PassByReference {



    static void changeArray(int [] a) {
        a[0] = 1;
    }

    public static void main(String[] args) {
        int a [] = {2,3,4};

        for(int ele : a) {
            System.out.print(ele + "  ");
        }

        changeArray(a);
      System.out.println();
        for(int ele : a) {
            System.out.print(ele + "  ");
        }

    }
}
