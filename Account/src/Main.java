import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);


        Account ac1=new Account("Jane",50.00 );
        Account ac2=new Account("John",0.52 );

        System.out.println( "name :  " + ac1.getName() + " balance : " + ac1.getBalance() );
        System.out.println("name : " + ac2.getName() + " balance : " + ac2.getBalance());

        System.out.println("Deposit ammount for " + ac1.getName() +":" );
        double depositAmount=scanner.nextDouble();
        ac1.deposit(depositAmount);

        System.out.println("Deposit ammount for " + ac2.getName() +":");
        depositAmount=scanner.nextDouble();
        ac2.deposit(depositAmount);

        System.out.println( "name :  " + ac1.getName() +   "   Balance : " + ac1.getBalance() );
        System.out.println("name : " + ac2.getName() +    "    Balance : " + ac2.getBalance());



    }
}