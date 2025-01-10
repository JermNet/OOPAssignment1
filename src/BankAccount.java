public class BankAccount {

    //Encapsulation used her since this is private and only accessed with methods
    private double accountBalance;

    public BankAccount(double b) {
        accountBalance = b;
    }

    //Adds to accountBalance
    public void deposit(double d) {
        accountBalance += d;
    }

    //Subtracts from accountBalance
    public void withdraw(double w) {
        accountBalance -= w;
    }

    public void changeBalance(double b) {
        accountBalance = b;
    }

    public double getBalance() {
        return accountBalance;
    }

}
