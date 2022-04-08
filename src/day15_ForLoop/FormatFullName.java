package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("first name: ");
        String name= scan.nextLine();
        System.out.println("surname: ");
        String surname=scan.nextLine();


        name=name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        surname=surname.substring(0,1).toUpperCase()+surname.substring(1).toLowerCase();

        System.out.println("name = " + name);
        System.out.println("surname = " + surname);

//name=(""+name.charAt(0)).toUpperCase()+name.substring(1).toLowerCase



    }
}
/*
. Write a program that asks user to enter first and last names, and
then prints the full name in regular format (first character in upper
case)
input:
firstName = "cyDEo"
lastName = "SCHOOL";
output:
Cydeo School
 */