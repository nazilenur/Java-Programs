
public class Customer {
    private String name;
    private int registerNumber;

    Customer(){
        this.name=name;
        this.registerNumber=registerNumber;
    }

    public void setName(String name){
       this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setRegisterNumber(int registerNumber){
        this.registerNumber=registerNumber;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void toString(Customer customer){
        System.out.println("Customer name is : " + customer.getName() + " Customer register number is : " +
                customer.getRegisterNumber());
    }


}
