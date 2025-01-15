public class Main {
    public static void main(String[] args) {

        Company c1=new Company("Default name");
        System.out.println(c1.getAdress());

        AkinSoft a1=new AkinSoft();
        System.out.println(a1.getAdress());

        GoogleCompany g1=new GoogleCompany();
        System.out.println(g1.getAdress());

        MicrosoftCompany m1=new MicrosoftCompany();
        System.out.println(m1.getAdress());

        g1.print();


    }
}