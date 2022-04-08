package week02;

import jdk.swing.interop.SwingInterOpUtils;

public class CarInfo {
    public static void main(String[] args) {

         int year = 2022;
         String make = "Range",
                model ="Rover";

         boolean transmission = true;
         String  colour =  "black";
         int milage = 0;
         int price = 100_000;

        System.out.println(year + " " + make + " " + model + " " +"\nAutamatic Transmission :"
                + transmission + "\n" + price + "euro");


double priceInTl = price * 15.5;
        double TaxRate = 1.80;

         double priceAfterTaxInTl = priceInTl + (priceInTl * TaxRate);
        System.out.println(priceInTl);


    }
}
