package day12_Scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter cents: ");

        int cents= scan.nextInt();
        int dollar=(cents/100);
        int dollar1=(cents%100);

    if(dollar==0){
        System.out.println(cents + "cents equal to: " +dollar);
    }else{
        System.out.println(cents + " cents equal to: " + dollar + " dollars and " +dollar1+ " cents ");
    }







    }
}

/*
Write a program that can convert cents to dollars, if there is any
remainder include them in the result as cents
Ex:
Enter cents
225
output:
225 cents equal to: 2 dollars and 25 cents
 */