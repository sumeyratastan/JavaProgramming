package day16_LoopAndStringPractice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {



        System.out.println("enter a word");
        String reverse="";
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i);// adding each character to result
        }
        System.out.println(reverse);
    }
}
/*
7. Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW
 */