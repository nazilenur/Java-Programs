import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Customer customer1=new Customer();

        System.out.println("Please enter the customers name : ");

        String name=scanner.nextLine();

        customer1.setName(name);

        System.out.println("Please enter the customers register nmuber : ");

        int registerNumber= scanner.nextInt();

        customer1.setRegisterNumber(registerNumber);

        customer1.toString(customer1);


    }
}