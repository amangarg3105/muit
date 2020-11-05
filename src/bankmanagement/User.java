package bankmanagement;

public class User {

    public String userName;

    private double balance;


    User(String userName) {
        this.userName = userName;
    }

    public double getBalance() {
        return this.balance;  //user.balance
    }

    public void setBalance(double balance) {
        this.balance = this.balance + balance;
    }


}
