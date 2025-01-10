
public class WithdrawTransaction implements Transaction {

    //These methods implement the execute methods from the Transaction interface
    public void execute(SavingsAccount account, double e) {
        account.withdraw(e);
    }

    public void execute(BankAccount account, double e) {
        account.withdraw(e);
    }
}
