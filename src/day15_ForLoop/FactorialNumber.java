package day15_ForLoop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        System.out.println("enter a number");

        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        int sum=1;


            for (int i =num; i >=1; i--) {
              sum*=i;
            }

        System.out.println("sum = " + sum);
    }
}
/*
4. Write a program that can return the factorial number of any given
number
Ex:
input: 5
output: 120
( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */