package iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateArray {

    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList();

        al.add("A");
        al.add("B");
        al.add("C");


        ListIterator listIterator = al.listIterator();

        System.out.println(listIterator.next()); //i++ //A
        System.out.println(listIterator.next());  //B
        System.out.println(listIterator.next()); // C
        System.out.println(listIterator.previous()); //C
        System.out.println(listIterator.previous()); //B
        System.out.println(listIterator.next()); //B
        System.out.println(listIterator.previous()); //--i //B

        //
//        Iterator iterator = al.iterator();
//
//        iterator.next();
//        iterator.remove();
//
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }




        //Iterate over the list using list iterator
        // 1. Iterate in forward direction for print first half
        // 2. Iterate in backward direction, print rest half


//        ListIterator listIterator = al.listIterator();
//        System.out.println("Printing in forward direction");
//
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }
//
//
//        System.out.println("Printing in backward direction");
//
//
//        while (listIterator.hasPrevious()) {
//
//            System.out.println(listIterator.previous());
//        }
//
//        System.out.println(listIterator.previousIndex());







//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }


    }
}
