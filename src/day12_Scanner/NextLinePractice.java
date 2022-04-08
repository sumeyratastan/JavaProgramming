package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println(" please enter your age");
        int age= input.nextInt();
         input.nextLine();

        System.out.println("enter your full name");
        String name= input.nextLine();

        System.out.println("enter your GPA");
         double gpa=input.nextDouble();

         input.nextLine();// !!!IMPORTANT!!!



        System.out.println("enter your school name");
        String school= input.nextLine();



        System.out.println("age = " + age);
        System.out.println("name = " + name);
        System.out.println("gpa = " + gpa);
        System.out.println("school = " + school);
input.close();
    }
}
/*
1.enter age
2. enter full name

 */