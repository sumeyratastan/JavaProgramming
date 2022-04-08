package day14_String;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter email: ");

        String mail=scan.nextLine();

       String mail1=mail.substring(0,mail.indexOf("_"));
       String mail2=mail.substring(mail.indexOf("_")+1,mail.indexOf("@"));
       String email=mail.substring(mail.indexOf("@"));

       String result=mail2+"_"+mail1+email;

        System.out.println(result);


    }
}
/*
8. Create a class calledEmailTask1.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that can swap first name with last name in the
email (Seperated by an underscore).
If the email doesn't contain an underscore print the given input
email.
Ex:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
 */