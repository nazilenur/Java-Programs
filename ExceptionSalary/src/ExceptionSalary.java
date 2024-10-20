
public class ExceptionSalary {
    private String name;
    private int salary;

    ExceptionSalary() {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        if (salary <= 0) {
            throw new IllegalArgumentException("salary amount must be greater than zero");
            }
        this.salary = salary;
        }

    public int getSalary() {
        return salary;
    }

    public void toString(ExceptionSalary exceptionSalary) {
            System.out.println("Name : " + exceptionSalary.getName() +
                    " Salary  : " + exceptionSalary.getSalary());
        }
    }

