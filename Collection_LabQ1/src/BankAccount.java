public class BankAccount implements Comparable<BankAccount> {
    public int accountNo;
    public String holderName;
    public double balance;

    public BankAccount(int accountNo, String holderName, double balance){
        this.accountNo=accountNo;
        this.holderName=holderName;
        this.balance=balance;
    }

    public int compareTo(BankAccount b) {
        return this.holderName.compareTo(b.holderName);
    }

    public double balanceChange(double amount){
        return this.balance-amount;

    }

    @Override
    public String toString() {
        return holderName + " " + accountNo + " " + balance + " ";
    }
}

