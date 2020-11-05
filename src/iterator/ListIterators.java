package iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author amgarg
 */
public class ListIterators {



    /*

     */

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("A");
        al.add("B");
        al.add("C");

        ListIterator litr = al.listIterator();

        System.out.println(litr.next()); //i++
        System.out.println(litr.next());
        System.out.println(litr.next());
        System.out.println(litr.previous());
        System.out.println(litr.previous());
        System.out.println(litr.next());
        System.out.println(litr.previous()); //--i


        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            list1.add(i);
        }
        List<Integer> list2 = new LinkedList<Integer>();
        for (int i = 0; i < 100000; i++) {
            list2.add(i);
        }

        final long time1 = estimatePerformance(list1);
        final long time2 = estimatePerformance(list2);


        System.out.println("Array List took :" + time1);
        System.out.println("Linked List took :" + time2);


        if (time1 > time2) {
            System.out.println("LinkedList is faster");
        } else {
            System.out.println("ArrayList is faster");
        }

        System.out.println(time2 / time1);

    }

    private static long estimatePerformance(List<Integer> list) {
        final long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list.get(list.size()/2);
        }
        final long end = System.nanoTime();
        final long time = end - start;
        return time;
    }

}
