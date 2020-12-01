
public class Queue {

    int rear;
    int capacity;
    int size;
    int arr[];

    Queue() {
        rear = -1;
        capacity = 10;
        size = 0;
        arr = new int[capacity];
    }
    /**
     * if size == capacity -> queue is full
     *
     * if(rear == capacity - 1) {
     *     rear = -1;
     * }
     * rear++;
     * arr[rear] = element;
     *
     * @param element
     */
    public void enqueue(int element) {
        if(isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if(rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = element;
        size++;
    }


    public boolean isFull() {
        if(size == capacity) {
            return true;
        }
        return false;
    }


}
