package day16_LoopAndStringPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("enter a word");

        Scanner scan=new Scanner(System.in);
        String word=scan.next();
String result="";

            for (int j = word.length()-1; j >=0 ; j--) {

                result+=word.charAt(j);

            }
            boolean palindrome= word.equalsIgnoreCase(result)?true:false;
        System.out.println("palindrome = " + palindrome);



    }
}
/*
8. Write a program that can check if the given String is palindrome
Ex:
input:
Level
output:
true
input:
Anna
output:
true
 */