public class Company {
    private String name;

    public  Company(String name){
        this.name=name;

    }
    protected String getAdress(){
        return "Default adress";
    }
    public void print(){
        System.out.println("Name is : " + name + " Company Adress is :  " + getAdress());

    }
}
