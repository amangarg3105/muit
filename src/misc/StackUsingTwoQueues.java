package misc;


import queues.Queue;

public class StackUsingTwoQueues {



    private Queue q1;
    private Queue q2;
    private int size;

    StackUsingTwoQueues()  {
        q1 = new Queue();
        q2 = new Queue();
        size = 0;
    }

    /**
     * O(1)
     * @param element
     */
    public void push (int element) {
        q1.enqueue(element);
        size++;
    }


    /**
     * Transfer all the elements from q1 to q2, till only one element is there in q1
     *
     * swap the names of q1 and q2
     *
     * TC - O(n)
     * @return
     */
    public int pop () {

       if(q1.isEmpty()) {
            return Integer.MAX_VALUE;
       }

       while(q1.size() != 1) {
           int element = q1.dequeue();
           q2.enqueue(element);
       }

       int poppedElement = q1.dequeue();
       size--;

       Queue q = q1;
       q1 = q2;
       q2 = q;

       return poppedElement;
    }


    /**
     * T.C - O(n)
     * @return
     */
    public int top () {

        if(q1.isEmpty()) {
            return Integer.MAX_VALUE;
        }

        while(q1.size() != 1) {
            int element = q1.dequeue();
            q2.enqueue(element);
        }

        int topElement = q1.front();
        q2.enqueue(topElement);

        Queue q = q1;
        q1 = q2;
        q2 = q;

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
