package day14_String;

import java.util.Scanner;

public class SameLetters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first word");
        String word1=scan.next();


        System.out.println("enter second word");
        String word2=scan.next();


        if(word1.charAt(word1.length()-1)==word2.charAt(0)){
            System.out.println(word1.substring(0)+word2.substring(1));
        }




    }
}
/*
4. Ask user to enter two words. Then add them together and print.
But if the last letter if the first word and the first letter of the
last letter is the same,
print that character once.
Input:
one
eight
Output:
oneight
 */