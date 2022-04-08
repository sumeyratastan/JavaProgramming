package day13_String;

import java.util.Scanner;

public class FirstLastCharacters {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();
        int total=sentence.length();

        char first=sentence.charAt(1);
        char last=sentence.charAt(total-1);

        System.out.println("total = " + total);
        System.out.println("first = " + first);
        System.out.println("last = " + last);

        scan.close();
    }
}
/*
1. write a program that asks user to enter a sentence.
then print the first & last characters of the sentence
 */