package week02;

public class PrimetersExample {
    public static void main(String[] args) {

       byte num1;  // declaring a variable
        num1 =123; // initilazing variable
        num1 = 121; // reassign value
        short num2 =12398; // declare and initilaze
        int distance = 1_000_000_000;
        long distancemore = 3_000_000_000l;
        long distanceShorter =1_000_000_000;

          float rate = 1000.5f;
          double dNumber =123.6;
        System.out.println("---------Casting-------");


        System.out.println("Before Swapping Values ");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num2 = num1 ;

        System.out.println("After Swapping");
        System.out.println("num2 = " + num2);


        System.out.println("Expilicit number");
        num2 = (short) distance;

        System.out.println("num2 = " + num2);


        System.out.println("Explicit Casting of floating points");

         short rateTwo = (short) rate;

        System.out.println("rateTwo = " + rateTwo);



    }


}
