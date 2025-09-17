package banking;
public abstract class BankAccount{
    private String accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(String accountNumber,String holderName,double balance){
        setAccountNumber(accountNumber);
        setHolderName(holderName);
        setBalance(balance);
    }
    public String getAccountNumber(){return accountNumber;}
    public void setAccountNumber(String accountNumber){if(accountNumber==null||accountNumber.isEmpty()) throw new IllegalArgumentException("Invalid");this.accountNumber=accountNumber;}
    public String getHolderName(){return holderName;}
    public void setHolderName(String holderName){if(holderName==null||holderName.isEmpty()) throw new IllegalArgumentException("Invalid");this.holderName=holderName;}
    public double getBalance(){return balance;}
    public void setBalance(double balance){this.balance=balance;}
    public void deposit(double amount){if(amount<=0) throw new IllegalArgumentException("Invalid");balance+=amount;}
    public void withdraw(double amount){if(amount<=0||amount>balance) throw new IllegalArgumentException("Invalid");balance-=amount;}
    public abstract double calculateInterest();
}