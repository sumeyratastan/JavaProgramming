package day09_IfStatements;

import java.util.Scanner;

public class OxygenTank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your level of Oxygen");

        int level= scan.nextInt();
         String message;

        if(level>=90){
           message="Your tank is full";
        }
    else if(level>=80&&level<90){
    message="Still okay";
        }
   else if(level>=70&&level<80){
    message=" Don't go too far";
        }
    else if(level>=60&&level<70){
    message="Start to head back";
        }
    else if(level>=50&&level<60){
    message="Be careful now you at at 50%";
        }else{
         message="Oh Noo!";
        }

    System.out.println("message = " + message);

    }
}
/*
Create a class called OxygenTank. You are diving in the ocean. Your
oxygen tank has a certain level (number) and you must print a message
based on the level:
Above 90 -  Your tank is full
Above 80 -  Still okay
Above 70 -  Don't go too far
Above 60 -  Start to head back
Above 50 -  Be careful now you at at 50%
USE ONE PRINT STATEMENT ONLY
 */