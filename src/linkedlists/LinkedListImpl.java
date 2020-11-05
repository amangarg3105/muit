package linkedlists;


import java.util.Collections;
import java.util.PriorityQueue;

public class LinkedListImpl {


    public static void main(String[] args) {


        Node node1 = new Node(9);

        Node node2 = new Node(10);

        Node node3 = new Node(11);

        Node node4 = new Node(15);

        Node node5 = new Node(19);

        Node node6 = new Node(12);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next =node5;



        Node start = node1;
//
//        start = start.next; //node1.next
//
//        System.out.println(start.data);
//
//        start =  start.next; // node2.next
//
//        System.out.println(start.data);
//
//        start = start.next;
//
//        System.out.println(start.data);


//        while(start.next != null) {
//            System.out.println(start.data);
//            start = start.next;
//        }


        //Inserting in middle
        node3.next = node6;
        node6.next = node4;


//Iterate over linkedList
        while(start.next != null) {
            System.out.println(start.data);
            start = start.next;
        }










        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

        maxPQ.add(7);
        maxPQ.add(5);
        maxPQ.add(7);





        for(Integer i : maxPQ) {
            System.out.println(i);
        }

    }
}
