package day09_IfStatements;

import java.util.Scanner;

public class Finra {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Print a number");
        int number= scan.nextInt();



        if(number%5==0 && number%3==0){
            System.out.println("FINRA");
        }
        else if(number%3==0 && number%5!=0){
            System.out.println("FIN");
        }
        else if(number%5==0 && number%3!=0){
            System.out.println("RA");
        }
        else{
            System.out.println("none");
        }





    }
}
/*
Create a class called FINRA, Write a function which prints out the
number. but for number which is a multiple of 3, print "FIN" instead
of the number and for number which is a multiple of 5, print "RA"
instead of the number. and for number which is a multiple of both 3
and 5, print "FINRA" instead of the number.
ex:
number = 3
output:
FIN
number = 10
output:
RA
number = 15
output:
FINRA
 */