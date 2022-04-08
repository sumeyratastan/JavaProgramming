package day14_String;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter email: ");
        String email=scan.nextLine();

        String first= email.substring(0,email.indexOf("_"));
        String last=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));


        first = first.toUpperCase().charAt(0) + first.substring(1).toLowerCase();


        last = last.toUpperCase().charAt(0) + last.substring(1).toLowerCase();


        System.out.println("first = " + first);
        System.out.println("last = " + last);
        System.out.println("domain = " + domain);


    }
}
/*
9. Create a class called EmailTask2.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that will print out information about user based on
email. Print first name, last name, and domain.
First and Last name should be printed with proper format -
uppercase first letter and remaining lowercase.
Ex:
input:
craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */
