package bankmanagement;

/**
 * @author amgarg
 */
public class BankMainClass {


    public static void main(String[] args) {

        //Creating the user object with userName xyz
        User user = new User("xyz");


        //Printing the userName and their balance

        System.out.println(user.userName + " " + user.getBalance());

        user.setBalance(500);

        System.out.println(user.userName + " " + user.getBalance());

        user.setBalance(1000);

        System.out.println(user.userName + " " + user.getBalance());








    }
}
