package day31_Constructors.scrumTask;

public class Tester {
    public String name;
    public int employeeID;
    public String jobTittle;
    public double salary;

    public Tester(String name, int employeeID, String jobTittle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTittle = jobTittle;
        this.salary = salary;

    }


    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", id=" + employeeID +
                ", jobTittle='" + jobTittle + '\'' +
                ", salary=$" + salary +
                '}';
    }


    public void smokeTesting(){
        System.out.println(name+"is smoke testing");
    }
     public void createTicket(){
         System.out.println(name+"is creating ticket");
     }




}
/*
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary
	        Add A constructor that can set all the fields
	        Actions:
	           smokeTesting(),  creatingTicket(),  toString()
 */