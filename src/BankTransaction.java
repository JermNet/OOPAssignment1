public class BankTransaction {

    //Deposits money into a BankAccount class
    public void executeTransaction(BankAccount account, double amount) {
        account.deposit(amount);
    }

    public void executeTransaction(SavingsAccount account, double amount) {
        account.deposit(amount);
        account.applyInterest();
    }
}
