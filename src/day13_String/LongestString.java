package day13_String;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first word");
        String word1 = scan.next();
         int number1=word1.length();

        System.out.println("enter second word");
        String word2 = scan.next();
        int number2=word2.length();


        String result = "";

        if (word1.length() > word2.length()) {
            result = word1;
        } else{
            result=word2;
        }
        System.out.println("result = " + result);

    }
}
/*
2. write a program that asks user to enter two strings, and print out the
longest string
 */