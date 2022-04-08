package day31_Constructors.restaurantTask;

public class Chef {
    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;

    public Chef(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }


    public void makeOrder(){
        System.out.println(name+" is making an order");
    }

    public void washDishes(){
        System.out.println(name+ " is washing the dishes");
    }

    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + (isFullTime?"full-time":"part-time") +
                '}';
    }
}
/*
6. Restaurant Task:

6.2 Create a class called Chef
            Attributes:
                name (String),
employeeID (int), hourlyRate (double), fullTime (boolean)
   Add A constructor that can set all the
fields
            Actions: (all void methods)
                makeOrder(): chef's
name + "is making an order"
                washDishes(): chef's
name + "is washing the dishes"
                toString(): Returns
(String) all the information of a Chef
                    -> Extra: For
fullTime status, instead of printing a boolean value, print "full-time" or
"part-time"


 */