import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the first value : ");
            double value1= scanner.nextDouble();
            System.out.println("Enter the second value : ");
            double value2= scanner.nextDouble();
            System.out.println("Your result is : " +  value1/value2);
        }
       catch(Exception e)
    {
           System.out.println("Exception error ! ");
            System.out.println(e.getMessage());
        }
        finally
    {
            System.out.println("Procces is done ");
        }

    }
}