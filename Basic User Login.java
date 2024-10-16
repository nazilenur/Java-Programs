import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String username;
        String password;
        System.out.println("Enter your username :");
        username=scanner.nextLine();
        System.out.println("Enter your password : ");
        password=scanner.nextLine();
         if(username.equals("Nazile Nur")&&password.equals("1234")){
             System.out.println("Succesful login!");
         }else{
             System.out.println("Unseccessful login,try again!");
         }
    }
}