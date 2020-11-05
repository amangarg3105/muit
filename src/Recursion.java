

public class Recursion {

    //2^n
    public int fibonacci(int n) {
        if (n < 2)
            return n;

        int smallOutput1 = fibonacci(n - 1);
        int smallOutput2 = fibonacci(n - 2);

        return (smallOutput1 + smallOutput2) % 10;
    }


    //TC =
    static void print(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        print(n + 1);
    }


    public static void main(String[] args) {
        print(1);
    }
}
