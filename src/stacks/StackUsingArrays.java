package stacks;


public class StackUsingArrays {


    private int [] arr;
    private int top;

    StackUsingArrays() {
        arr = new int[10];
        top = -1;
    }

    /**
     *
     *
     * @param element
     */
    public void push(int element) {
        if(top > 10) {
            System.out.println("Overflow, cannot perform push");
            return;
        }
        top++;
        arr[top] = element;
    }


    public int pop() {

        if(top < 0) {
            System.out.println("Underflow, cannot perform pop");
            return Integer.MAX_VALUE;
        }
        int element = arr[top];
        top--;
        return element;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top < 0;
    }


    public int top() {
        if(top < 0) {
            System.out.println("Underflow, cannot perform pop");
            return Integer.MAX_VALUE;
        }
        return arr[top];
    }


    public boolean search(int element) {

        for(int tempIndex = top; tempIndex >=0; tempIndex--) {
            if(arr[tempIndex] == element) {
                return  true;
            }
        }
        return false;
    }

}
