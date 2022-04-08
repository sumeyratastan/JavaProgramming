package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Sumeyra";
        String lastName = "Tastan";
        String fullName= firstName + " " + lastName;
        int age = 30;
        String jobTittle = "SDET";
        String companyName = "AppleInc";
        double salary = 100000.58;
        System.out.println(fullName);

//Full name of the person is __________

        System.out.println("Full name of the person is " + firstName);


        // ---- is ----years old.
        System.out.println(fullName + " is " + age + " years old.");


        //FullName is JobTittle , works at  CompanyName, and salary is salary.

        System.out.println(fullName + " is " + jobTittle + " , works at " + companyName + " , and salary is $" + salary + ". ");


    }

}
/*
1. Create a class called FullName.java
2. Declare the following variables:
1.firstName
2.lastName
3. Use concatenation to print the full address
 */