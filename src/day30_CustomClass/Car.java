package day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String colour;
    public int year;
    public int price;

    public void setInfo(String carBrand,String carModel,String carColour,int carYear,int carPrice){
        brand=carBrand;
        model=carModel;
        colour=carColour;
        year=carYear;
        price=carPrice;
    }


    public void drive(){
        System.out.println("Driving "+brand+" "+model);
    }


    public void start(){
        System.out.println(brand+" "+model+" has started");
    }

    public void stop(){
        System.out.println(brand+" "+model+" has stopped");
    }


    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }



}
