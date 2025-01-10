//Makes this a subclass of BankAccount
public class SavingsAccount extends BankAccount {

    public double interestRate;

    public SavingsAccount(double b, double i) {
        //Uses this to construct the super class, BankAccount
        super(b);
        interestRate = i;

    }

    public void setInterestRate(double i) {
        interestRate = i;
    }

    public double getInterestRate() {
        return interestRate;
    }

    //Applies the interest
    public void applyInterest() {
        changeBalance((interestRate*getBalance())+getBalance());
    }
}
