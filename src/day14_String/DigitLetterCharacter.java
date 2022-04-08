package day14_String;

import java.util.Scanner;

public class DigitLetterCharacter {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word");
        String word=scan.next();

     char firstChar=word.charAt(0);

        if (firstChar >= '0' && firstChar <= '9') {

            System.out.println("first character is digit");
        }else if(firstChar>='a' && firstChar<='z'){
            System.out.println("first character is lowercase letter");
        }else if(firstChar>='A'&& firstChar<='Z'){
            System.out.println("first character is uppercase character");
        }else{
            System.out.println("first character is special character");
        }

    }
}

/*
5. Ask user to enter a word,
if the word starts with digits, print "first character is digit"
if the word starts with uppercase letters, print "first character
is lowercase letter"
if the word starts with lowercase letters, print "first character
is uppercase letter"
if the word starts with special characters, print "first character
is special character"
HINT: 1. you need charAt() method
6. Ascii Table
 */