import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        double radius;
       double pi=3.14;
       System.out.println("Enter the raidus of circle: ");
       radius=scanner.nextDouble();
       double area,circumference;
       area=2*pi*radius*radius;
       circumference=2*pi*radius;
       System.out.println("Circle area is : " + area + " Circle circumference is : " + circumference);

    }
}