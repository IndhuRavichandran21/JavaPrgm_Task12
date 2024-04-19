package task12.com.example.hr;
public class Employee {
    public String name;
    public int id;
    public double salary;

    public Employee(){
        this.name="Abhi";
        this.id=1;
        this.salary=45000;
    }


    public void printName(){
        System.out.println(name);

    }

    public void printSalary(){
        System.out.println(salary);

    }
}
