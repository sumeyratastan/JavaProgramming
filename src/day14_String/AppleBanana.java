package day14_String;

import java.util.Scanner;

public class AppleBanana {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter first word: ");
        String firstWord= scan.next();

        firstWord=firstWord.substring(1);



        System.out.println("Please enter second word: ");
        String secondWord= scan.next();

        secondWord=secondWord.substring(1);

        System.out.println(firstWord+secondWord);





    }
}
/*
1. Ask user to enter two words. Print first word without its first
character
then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana
 */