public interface Transaction {
    public void execute(SavingsAccount account, double e);

    public void execute(BankAccount account, double e);
}
