package misc;




public class StackDriver {

    public static void main(String[] args) {
        StackUsingTwoQueues s1 = new StackUsingTwoQueues();

        s1.push(1);
        s1.push(2);
        s1.push(3);

        System.out.println(s1.top());

        s1.pop();

        System.out.println(s1.top());


    }
}
