package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter your full name");
        String name= input.nextLine();

        System.out.println("enter your building number");
        int number=input.nextInt();

        input.nextLine();

        System.out.println("enter your street name");
        String street= input.nextLine();

        System.out.println("enter your city name");
        String city= input.nextLine();

        System.out.println("enter your state");
        String state= input.next();



        System.out.println("enter your zipcode");
        String zip= input.next();

       input.nextLine();

        System.out.println("enter country name");
        String country= input.nextLine();


        System.out.println("name = " + name);
        System.out.println("number = " + number);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zip = " + zip);
        System.out.println("country = " + country);


input.close();

    }
}
/*
full name
building number
street name
city name
state
zipcode
display shipping address
 */