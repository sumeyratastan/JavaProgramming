package day19_LoopsPractices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter a number: ");
        int num1= scan.nextInt();

        System.out.println("enter a math operator:");
        char operator= scan.next().charAt(0);

        if(!(operator=='+'||operator=='-')){
            System.err.println("Invalid math operator"+operator);
            System.exit(0);
        }


        System.out.println("enter a number:");
        int num2= scan.nextInt();

        if (operator == '-'){
            System.out.println(num1 - num2);
        }else{
            System.out.println(num1 + num2);
        }


    }
}
