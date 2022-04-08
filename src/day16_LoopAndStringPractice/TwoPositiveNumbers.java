package day16_LoopAndStringPractice;

import java.util.Scanner;

public class TwoPositiveNumbers {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter two positive numbers");

        int firstNumber=scan.nextInt();
        int secondNumber= scan.nextInt();

        int total=0;

        for (int i = 0; i <secondNumber ; i++) {

            total+=firstNumber;
        }

        System.out.println(total);



    }
}
/*
3. Write a program that asks user to enter two positive numbers,
then multiply those two numbers without using multiplication (*)
operator.
if user enters any negative numbers, print Invalid
Ex:
inputs:
10
20
output:
200
 */