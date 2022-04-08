package day10_NestedIf;

import java.util.Scanner;

public class GradeReport2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter your score");
        int s = scan.nextInt();
        String result= s>=0&&s<=100? ((s>=90)?"excellent" :(s>=80)?"great" :(s>=70)?"good" :(s>=60)?"passed"
                :"failed") :"invalid";
        String result2="";
        System.out.println(result);

        System.out.println("----------------------------------------");

        if(s>=0&&s<=100){
            result=  (s>=90)?"excellent" :(s>=80)?"great" :(s>=70)?"good" :(s>=60)?"passed"
                    :"failed";
        }else{
            result2= "invalid";
        }





//applied scanner class
//replace ctrl+r

    }
}
