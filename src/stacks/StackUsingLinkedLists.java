package stacks;


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class StackUsingLinkedLists {


    private Node head = null;

    public void push(int element) {

        Node temp;
        if (head == null) {
            temp = new Node(element);
        } else {
            temp = new Node(element);
            temp.next = head;
        }
        head = temp;
    }

    public int Size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean isEmpty() {
        return Size() == 0;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Underflow, cannot perform pop");
            return  Integer.MAX_VALUE;
        }
        int element = head.data;
        head = head.next;
        return element;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return  Integer.MAX_VALUE;
        }
        return head.data;
    }
}
