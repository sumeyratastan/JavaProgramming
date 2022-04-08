package day13_String;

import java.util.Scanner;

public class InitialsTheUser {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the first word");
        String str1= scan.next();

        System.out.println("Please enter the second word");
        String str2= scan.next();

        str1=str1.toUpperCase();
        str2=str2.toUpperCase();

        char ch1=str1.charAt(0);
        char ch2=str2.charAt(0);

        System.out.println(ch1+"."+ch2);




    }
}
/*
write a program that can return the initials of the user
ex:
cybertek
school
output:
C.S
Note: Pay attention to the example output
 */