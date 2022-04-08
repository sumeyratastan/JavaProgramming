package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter your full name");
        String name= input.nextLine();

        System.out.println("enter your programming language");
        String programming= input.nextLine();

        System.out.println("enter your age");
        int age= input.nextInt();

        input.nextLine();//capture the enter key that user press


        System.out.println("enter school name");
        String schoolName=input.nextLine();

        System.out.println("name = " + name);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

         input.close();

    }
}
