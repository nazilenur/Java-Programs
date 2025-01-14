import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       // List<BankAccount> accounts=new ArrayList<>();
        BankAccount a1 = new BankAccount(123, "Jack", 1200);
        BankAccount a2 = new BankAccount(1234, "Asa", 1705);
        BankAccount a3 = new BankAccount(12345, "Nlank", 1785);
        BankAccount a4 = new BankAccount(123456, "Niyah", 2500);

        List<BankAccount> myAccounts = new ArrayList<>();
        myAccounts.add(a1);
        myAccounts.add(a2);
        myAccounts.add(a3);
        myAccounts.add(a4);


        Collections.sort(myAccounts);

        for (BankAccount m : myAccounts) {
           // System.out.println("Sorted names : " + m.holderName);
          //  System.out.println("Total balance : " + m.balanceChange(500));
           System.out.println(m.toString());

        }
    }
}
