package banking;
public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(String acc,String name,double balance,double interestRate){
        super(acc,name,balance);
        setInterestRate(interestRate);
    }
    public double getInterestRate(){return interestRate;}
    public void setInterestRate(double interestRate){if(interestRate<0) throw new IllegalArgumentException("Invalid");this.interestRate=interestRate;}
    public double calculateInterest(){return getBalance()*interestRate;}
}