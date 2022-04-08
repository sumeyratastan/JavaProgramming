package day09_IfStatements;

import java.util.Scanner;

public class SalaryAfterTax {
    public static void main(String[] args) {
     Scanner scan= new Scanner(System.in);
        System.out.println("Enter your Salary:");
       double salary= scan.nextDouble();
       double salaryAfterTax;
        if (salary>=130000){
            salaryAfterTax = salary- salary*0.35;
        } else if (salary>= 100000 && salary<130000){
            salaryAfterTax = salary- salary*0.30;
        } else if (salary>= 80000 && salary<100000){
            salaryAfterTax = salary- salary*0.25;
        } else
            salaryAfterTax = salary- salary*0.20;

        System.out.println("Salary after Tax: $" +salaryAfterTax );

        Scanner scanner=new Scanner(System.in);
        System.out.println("are you married");
        boolean isMarried = scanner.nextBoolean();
        double marriedBonus = salaryAfterTax + salaryAfterTax*0.05;
        if (isMarried){
            System.out.println("Salary after tax for married persons: $" + marriedBonus);
        }

    }

}
/*
Write a program that can calculate the salary after tax based on the
following requirements
the tax rates are:
35% for salary of 130K or more
30% for salary of 100K to 130k
(excluded)
25% for salary of 80K to 100K
(excluded)
20% for salary less than 80K
in addition, if the person is married, he/she will pay 5%
less tax
 */