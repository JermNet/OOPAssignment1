
public class DepositTransaction implements Transaction {

    //These methods implement the execute methods from the Transaction interface
    public void execute(SavingsAccount account, double e) {
        account.deposit(e);
    }

    public void execute(BankAccount account, double e) {
        account.deposit(e);
    }

}
