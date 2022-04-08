package day05_Concatenation;

public class ShippingAdress {

    public static void main(String[] args) {

       String name = "Sumeyra Tastan";
       int buildingNumber = 22;
       String streetName = "Wimborne Close";
       String city = "Epsom";
       String state = "Surrey";
       String zipCode = "KT17 4DP";


      //  System.out.println(name +"\n"+buildingNumber+ " " + streetName + "\n"+city+ ", " + state + "\n"+ zipCode);

String adress = name +"\n"+buildingNumber+ " " + streetName + "\n"+city+ ", " + state + "\n"+ zipCode;

        System.out.println(adress);

    }


}
/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1.name
2.buildingNumber
3.streetName
4.city
5.state
6.zipCode
3. Use concatenation to print the full address
 */