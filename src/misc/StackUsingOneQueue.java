package misc;


import queues.Queue;

public class StackUsingOneQueue {



    private Queue q1;
    private int size;

    StackUsingOneQueue()  {
        q1 = new Queue();
        size = 0;
    }

    /**
     *
     * Take the size of queue before adding any element is queue
     * enqueue the element in queue
     *
     *
     * O(n)
     * @param element
     */
    public void push (int element) {

        int size = q1.size();

        q1.enqueue(element);

        for(int i = 0; i <  size; i++) {
            int tempElement = q1.dequeue();
            q1.enqueue(tempElement);
        }
    }


    /**
     * TC - O(1)
     * @return
     */
    public int pop () {

        if(q1.isEmpty()) {
            System.out.println("Queue is empty");
            return  Integer.MAX_VALUE;
        }

        int poppedElement = q1.dequeue();
        return poppedElement;

    }


    /**
     * T.C - O(1)
     * @return
     */
    public int top () {


        if(q1.isEmpty()) {
            System.out.println("Queue is empty");
            return  Integer.MAX_VALUE;
        }

        int topElement = q1.front();
        return topElement;
    }

    /**
     * T.C - O(1)
     * @return
     */
    public boolean isEmpty () {

        if(size == 0) {
            return true;
        }
        return  false;
    }

    /**
     * T.C - O(1)
     * @return
     */
    public int size() {
        return size;
    }
}
