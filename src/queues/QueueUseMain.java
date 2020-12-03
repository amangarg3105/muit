package queues;


public class QueueUseMain {




    public static void main(String[] args) {

        Queue q = new Queue();

        for(int i = 1; i <= 10;  i++) {
            q.enqueue(i);
        }

        System.out.println(q.front());

        System.out.println(q.rear());

        for(int i = 1; i <= 5;  i++) {
           int element =  q.dequeue();
           System.out.println(element);
        }

        System.out.println(q.front());

        System.out.println(q.rear());

    }
}
