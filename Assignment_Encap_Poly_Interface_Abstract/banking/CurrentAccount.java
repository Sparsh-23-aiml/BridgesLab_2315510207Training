package banking;
public class CurrentAccount extends BankAccount implements Loanable{
    private double overdraft;
    public CurrentAccount(String acc,String name,double balance,double overdraft){
        super(acc,name,balance);
        setOverdraft(overdraft);
    }
    public double getOverdraft(){return overdraft;}
    public void setOverdraft(double overdraft){if(overdraft<0) throw new IllegalArgumentException("Invalid");this.overdraft=overdraft;}
    public double calculateInterest(){return 0;}
    public boolean applyForLoan(double amount){return amount<=getBalance()*2;}
    public double calculateLoanEligibility(){return getBalance()*2;}
}