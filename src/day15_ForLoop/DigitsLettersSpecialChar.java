package day15_ForLoop;

import java.util.Scanner;

public class DigitsLettersSpecialChar {
    public static void main(String[] args) {

        System.out.println("Enter a word");

        Scanner scan= new Scanner(System.in);
        String word=scan.nextLine();
        String letter="";
        String digit="";
        String special="";

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)>='0'&&word.charAt(i)<='9'){
                digit +=""+word.charAt(i);
            }else if(word.charAt(i)>='a' && word.charAt(i)<='z'||word.charAt(i)>='A' && word.charAt(i)<='Z'){
                letter+=""+word.charAt(i);
            }else{
                special+=""+word.charAt(i);
            }


        }

        System.out.println("letter = " + letter);
        System.out.println("digit = " + digit);
        System.out.println("special = " + special);








    }
}
/*
5. write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
 */