package stacks;


public class StackUse {


    public static void main(String[] args) {

        StackUsingArrays s = new StackUsingArrays();

        s.push(1);
        s.push(2);

        s.push(3);

        int top = s.top();

        System.out.println("Top Element is " + top);

       int element =  s.pop();
        System.out.println("Popped Element is " +element);


        top = s.top();

        System.out.println("Top element is " + top);

        while(!s.isEmpty()) {
            int element1 = s.pop();
            System.out.println("Popped Element is " +element1);
        }

        s.pop();

        boolean isAvailable = s.search(1);
        System.out.println("Element Available " + isAvailable);
    }




}
