import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Document d1=new Document();
        Book b1=new Book();
        EMail e1=new EMail();


        System.out.println("Belge tipini giriniz : 1-Document 2-Book 3-EMail ");
        int choice= scanner.nextInt();
        if(choice==1){
            System.out.println("Yazar sayisini giriniz:");
            int x= scanner.nextInt();
            scanner.nextLine();

            String authors[]=new String[x];

            for(int i=0;i<x;i++){
                authors[i]=scanner.nextLine();
            }
            d1.setAuthors(authors);

            for(String author:d1.getAuthors()){
                System.out.println(author);
            }
        } else if (choice==2) {
            System.out.println("Yazar sayisini giriniz : ");
            int x= scanner.nextInt();
            String author1[]=new String[x];
            scanner.nextLine();

            for(int i=0;i<x;i++){
                author1[i]= scanner.nextLine();
            }
            b1.setAuthors(author1);

            System.out.println("Enter the title of book : ");
            String title1= scanner.nextLine();
            b1.setTitle(title1);

        } else if (choice==3) {
            System.out.println("Yazar sayisini giriniz : ");
            int x= scanner.nextInt();
            scanner.nextLine();
            String author2[]=new String[x];
            scanner.nextLine();

            for(int i=0;i<x;i++){
                author2[i]= scanner.nextLine();
            }
            e1.setAuthors(author2);
            System.out.println("Enter the subject of email : ");
            String sub= scanner.nextLine();

            System.out.println("Maili gönderilecek kişi sayisini giriniz");
            int n= scanner.nextInt();
            scanner.nextLine();
            String who[]=new String[n];

            for(int i=0;i<n;i++){
                who[i]=scanner.nextLine();
            }
            e1.setTo(who);

        }else{
            System.out.println("Geçersiz seçim!");

        }
         d1.showInfos();
         b1.showInfos();
         e1.showInfos();


    }
}