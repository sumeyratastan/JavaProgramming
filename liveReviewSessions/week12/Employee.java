package week12;

public class Employee {

   public String name, jobTittle;
   public int ID;
   public double salary;
    public String jobTitle;

    public Employee(){

    }

    public Employee(String name, String jobTittle ,int ID,double salary){
        this.name=name;
        this.jobTittle=jobTittle;
        this.ID=ID;
        this.salary=salary;

    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTittle='" + jobTittle + '\'' +
                ", ID=" + ID +
                ", salary=" + salary +
                '}';
    }



}
