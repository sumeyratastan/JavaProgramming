package day11_Switch_Scanner;

import java.util.Scanner;

public class CappucinoBuyer {
    public static void main(String[] args) {

        String size = "venti";
        String result = "";

        switch (size) {
            case "tall":
                result = "price is $3.69 " +
                        "\n90 calories";
                break;
            case "grande":
                result = "price is $3.99" + "\n120 calories";
                break;

            case "venti":
                result = "price is $4.29 " +
                        "\n150 calories";
                break;
            default:
                result = "Invalid size";
        }

        System.out.println(result);




    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is
given, write a program that can display the price and calories of
cappuccino
Valid sizes are tall, grande, venti and their
price & calories are:
tall:
price is $3.69
90 calories
grande:
price is $3.99;
120 calories
venti:
price is $4.29
150 calories
If the size is invalid then the output should
be "Invalid Size"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed
 */