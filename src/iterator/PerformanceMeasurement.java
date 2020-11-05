package iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author amgarg
 */
public class PerformanceMeasurement {


    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        List<Integer> list2 = new LinkedList<Integer>();
        list2.add(1);

        //Array list operations
        final long startArrayList = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list1.add(0,i); // adding elements
        }
        final long endArrayList = System.nanoTime();
        final long time1 = endArrayList - startArrayList;



        //Linked list operations
        final long start = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            list2.add(0,i);// adding elements
        }
        final long end = System.nanoTime();
        final long time2 = end - start;

//Time 1 is representing how much time Array list took to fetch middle element of array list 10k times
        System.out.println("Array List took :" + time1);

        //Time 2 is representing how much time Linked list took to fetch middle element of Linked list 10k times
        System.out.println("Linked List took :" + time2);

        if(time1 < time2) {
            System.out.println("ArrayList is faster");
        } else {
            System.out.println("LinkedList is faster");
        }

        System.out.println(time1 / time2);

    }


}
