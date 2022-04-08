package day13_String;

import java.util.Scanner;

public class SameCharacters {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the word");
        String word= scan.nextLine();
        int total =word.length();

        char first= word.charAt(0);
        char last= word.charAt(total-1);


        if(first==last){
            System.out.println("First and last characters are same");
        }else{
            System.out.println("First and last characters are not same");
        }


    }
}
/*
3. write a program that can check if the first and last characters of the
string are same
ex:
level
output:
same
 */