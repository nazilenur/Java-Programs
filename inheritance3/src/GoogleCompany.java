public class GoogleCompany extends Company {

public GoogleCompany(){
    super("GOOGLE");
}

    @Override
    public void print() {
        System.out.println("Google adress is : ");
        super.print();

   }

    @Override
    protected String getAdress() {
        return "Google adress is :125.cad";
    }

    private void DoSomething(){
        System.out.println("Processing");

    }
}
