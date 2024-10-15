import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        int choice;
        System.out.println("Enter first number:");
        a = scanner.nextInt();
        System.out.println("Enter the second numbers");
        b = scanner.nextInt();

        while(true){
            System.out.println("1-Sum operation " +
                "2- Multiply Operation " +
                "3- Subtract Operation " +
                "4- Divide Operation"+
                "0- Over the calculating");
            choice = scanner.nextInt();
        switch (choice) {
            case 1:
                    System.out.println("Result :" +sum(a, b));
                break;
            case 2:
                System.out.println( "Result :" + multiply(a, b));

                break;
            case 3:
                System.out.println("Result :" + subtract(a, b));

                break;
            case 4:
                if(b!=0){
                    System.out.println("Result :" + divide(a, b));

                }else{
                    System.out.println("Invalid entry try again!");
                }
                break;
            default:
                System.exit(0);

        }
        }
    }

    public static int sum(int a, int b) {
        return a + b;

    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
      return a-b;
    }

    public static double divide(int a, int b) {
       return (double) a/b;
            }
        }