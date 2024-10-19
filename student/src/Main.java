import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Students st1 = new Students("Nazli",75,87);
        System.out.println(st1.average() +" -" +st1.name);

        st1.name="Asli";
        System.out.println(st1.name+ " - "+ st1.average());

        Students st2=new Students();

        System.out.println("Please enter the student name:");
        st2.name=scanner.nextLine();
        System.out.println("Please enter the student midterm note:");
        st2.midterm=scanner.nextInt();
        System.out.println("Please enter the student final exam note :");
        st2.finalExam=scanner.nextInt();

        System.out.println(st2.name+ " - "+  st2.average());

        st1.toString(st1);
        st2.toString(st2);

    }

}
