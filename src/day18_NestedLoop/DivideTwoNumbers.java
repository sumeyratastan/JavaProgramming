package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a=50;
        int b=9;
        int count=0;

        while(a>=b){
            a-=b;
            count++;
        }

        System.out.println(count+ " with a remainder of "+ a);


        System.out.println("-----------------------------------------------------------------");

        int x =37;
        int y=4;
        int count1=0;

        while (x>=y){
            x-=y;
            count1++;
        }


        System.out.println(count1);










    }
}
/*
1. Write a program that can divide two positive numbers without
using / (division) and * (multiplication) and % operators
 */