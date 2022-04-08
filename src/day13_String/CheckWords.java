package day13_String;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter first word");
        String str1=scan.nextLine();
        int length1=str1.length();

        System.out.println("enter second word ");
        String str2=scan.nextLine();
        int length2=str2.length();

        System.out.println("enter third word ");
        String str3=scan.nextLine();
        int length3=str3.length();


        if(length1==length2&&length2==length3){
            System.out.println("All words are same length");
        }else if(length1==length2){
            System.out.println("Not Same nor Different lengths");
        }else if(length1==length3){
            System.out.println("Not Same nor Different lengths");
        }else if(length2==length3){
            System.out.println("Not Same nor Different lengths");
        }else{
            System.out.println("All different length");
        }


    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
- if they are same length:  print "All words are same length"
- if some same length and others not:    print "Not Same nor
Different lengths"
- if all different length :  print "All different length"
 */