
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        ExceptionSalary exc1=new ExceptionSalary();

        System.out.println("Enter the name : ");
        String name= scanner.nextLine();;
        exc1.setName(name);

        System.out.println("Enter the salary : ");
        int salary= scanner.nextInt();
        try{
            exc1.setSalary(salary);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        exc1.toString(exc1);
    }
}