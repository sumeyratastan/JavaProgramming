package day08_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        /*
        System.out.println("odd number");

        System.out.println("even number");
           */
        int number = 101;

        boolean evenNumber = number%2==0;
        if(evenNumber){ //even number
            System.out.println(number+ " is even number.");
        }

        if(!evenNumber){ //not even number
            System.out.println(number+ " is odd number.");
        }

        System.out.println("----------------------------");

          int n =200;

          //
         if(n>=0) {
             System.out.println(n + " is positive");
         }

         if(n<0) {

             System.out.println(n + "is negative");
         }
         if(n==0) {

             System.out.println(n + "is zero");

         }



    }
}
