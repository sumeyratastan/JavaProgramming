package day12_Scanner;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter miles: ");
        double miles= scan.nextDouble();

        double km= miles/0.621371;


        if(km!=0){
            System.out.println(miles+ " miles equal to "+ km +" kilometres");
        }
    }
}
/*
4. Write a program that can convert Miles to KM
Ex:
Enter miles:
10.0
output:
10.0 miles equal to 16.09 kilometers
 */