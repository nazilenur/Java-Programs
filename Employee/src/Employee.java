public class Employee {
    String name;
    double salary;
    double workHours;
    int hiringYear;

    Employee(String name,int salary,int workHours,int hiringYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hiringYear=hiringYear;
    }

public double tax(){
    if(this.salary>1000){
        return this.salary*0.3;
    }else{
        return 0;
    }
}

public double bonus(){
        double extra=this.workHours-40;
        if(extra>0){
            return extra*30;
        }else{
            return 0;
        }
}

public double incres(){
        int hired=2024-this.hiringYear;
        if(hired<10){
            return this.salary*0.5;
        }else if(hired>=10&&hired<20){
            return this.salary*0.1;
        }else{
            return this.salary*0.15;
        }
}
public void toString(Employee emp){
    System.out.println("name : "+this.name);
    System.out.println("Tax is : " + emp.tax());
    System.out.println("Bonus is : " + emp.bonus());
    System.out.println("Increase is " + emp.incres());

    double totalWage=this.salary- emp.tax()+ emp.bonus();
    System.out.println("Total wage : " + totalWage);

}
}