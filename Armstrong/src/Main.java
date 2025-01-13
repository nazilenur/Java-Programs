import java.util.Scanner;
public class Main {

      public static void main(String[] args) {
          Scanner scanner=new Scanner(System.in);

        int num;
        int temp1=0;
        int temp2=0;
        int digit=0;
        int counter=0;
        int sum=0;

        System.out.println("Enter the number : ");
        num=scanner.nextInt();
        num=temp1;
        num=temp2;
         while(num<0){
            num=num/10;
            digit++;
         }
        System.out.println("Digit : "+ digit);
         for(int i=0;i<digit;i++){
             temp1=num%10;
             for(int k=0;k<digit;k++){
                 sum*=sum+temp1;
         }
             num=num/10;

         }
         if(sum==temp2){
             System.out.println("It's a armstrong number.");
         }else{
             System.out.println("It's not a armstrong number.");
    }
}
}