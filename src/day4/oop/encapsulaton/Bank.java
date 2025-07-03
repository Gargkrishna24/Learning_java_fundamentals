package day4.oop.encapsulaton;

public class Bank {
    private long accountNumber;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double withdraw(double amount){
        if(amount>0&&amount<=balance) return balance-=amount;
        else return 0;
    }

    public double deposite(double amount){
        if(amount>0)balance+=amount;
        return balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", amount=" + balance +
                '}';
    }
}
