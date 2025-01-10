import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int input;

        BankAccount bankAccount = new BankAccount(1200.67);
        SavingsAccount savingsAccount = new SavingsAccount(3000.90, 2.0);

        BankTransaction bankTransaction = new BankTransaction();

        DepositTransaction depositTransaction = new DepositTransaction();
        WithdrawTransaction withdrawTransaction = new WithdrawTransaction();

        while (true) {
            System.out.println("Welcome to the banking transaction test! What would you like to do?"
                    + "\n0: Deposit with a Savings Account using it's super method."
                    + "\n1: Deposit into a Savings and Bank Account using the overloaded methods in the BankTransaction class."
                    + "\n2: Deposit using the DepositTransaction class that implements the Transaction interface."
                    + "\n3: Withdraw using the WithdrawTransaction class the implements the Transaction interface."
                    + "\n4: Quit.");
            input = key.nextInt();

            if (input == 0) {
                System.out.println("Please input how much you'd like to deposit.");
                savingsAccount.deposit(key.nextDouble());
                System.out.println("New balance is: " + savingsAccount.getBalance() + "!");
            } else if (input == 1) {
                System.out.println("Please input how much you'd like to deposit into the Bank Account.");
                bankTransaction.executeTransaction(bankAccount, key.nextDouble());
                System.out.println("Please input how much you'd like to deposit into the Savings Account.");
                bankTransaction.executeTransaction(savingsAccount, key.nextDouble());
                System.out.println("New balance for the Bank Account is: " + bankAccount.getBalance() + "!"
                        + "\nNew balance for the Savings Account is: " + savingsAccount.getBalance() + "!");
            } else if (input == 2) {
                System.out.println("Please input how much you'd like to depost.");
                depositTransaction.execute(savingsAccount, key.nextDouble());
                System.out.println("New balance is: " + savingsAccount.getBalance() + "!");
            } else if (input == 3) {
                System.out.println("Please input how much you'd like to withdraw.");
                withdrawTransaction.execute(savingsAccount, key.nextDouble());
                System.out.println("New balance is: " + savingsAccount.getBalance() + "!");
            } else if (input == 4) {
                break;
            } else {
                System.out.println("That's not a valid option.");
            }

        }
        key.close();

    }

}
