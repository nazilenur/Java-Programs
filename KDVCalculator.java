import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double prices;

        double kdv=0.18;

        System.out.println("Enter the price:");
        prices=scanner.nextDouble();
        prices+=prices*kdv;
        System.out.println("Your new prise is : "+ prices);



    }
}