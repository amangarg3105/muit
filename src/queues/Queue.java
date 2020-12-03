package queues;

public class Queue {

    private int rear;
    private int front = 0;
    private int capacity;
    private int size;
    private int arr[];

    public Queue() {
        rear = -1;
        capacity = 10;
        size = 0;
        front = 0;
        arr = new int[capacity];
    }

    /**
     * if size == capacity -> queue is full
     * <p>
     * if(rear == capacity - 1) {
     * rear = -1;
     * }
     * rear++;
     * arr[rear] = element;
     *
     * TC - O(1)
     * @param element
     */
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("queues.Queue is full");
            return;
        }
        if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = element;
        size++;
    }


    /**
     * TC - O(1)
     * @return
     */
    public int dequeue() {

        if (isEmpty()) {
            System.out.println("Cannot dequeue, as queue is empty");
            return Integer.MAX_VALUE;
        }

        int element = arr[front];

        this.front = (this.front + 1) % capacity;

        size--;

        return element;


    }

    /**
     * TC - O(1)
     * @return
     */
    public boolean isEmpty() {

        if (size == 0) {
            return true;
        }
        return false;
    }


    /**
     * TC - O(1)
     * @return
     */
    public int front() {
        if (isEmpty()) {
            System.out.println("No one in the queue");
            return Integer.MAX_VALUE;
        }

        return arr[front];
    }

    /**
     * TC - O(1)
     * @return
     */
    public int rear() {
        if (isEmpty()) {
            System.out.println("No one in the queue");
            return Integer.MAX_VALUE;
        }

        return arr[rear];
    }

    /**
     * TC - O(1)
     * @return
     */
    private boolean isFull() {
        if (size == capacity) {
            return true;
        }
        return false;
    }


    public int size() {
        return size;
    }


}
