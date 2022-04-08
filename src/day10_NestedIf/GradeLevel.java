package day10_NestedIf;

public class GradeLevel {
    public static void main(String[] args) {

        byte n = 20;

        String schoolType ="";

        if(n>=1&&n<=18){
            if(n<=5){
                schoolType="elementary school";
            }
            else if(n<=8){
               schoolType="middle school";
            }
            else if(n<=12){
                schoolType="high school";
            }
            else if(n<=16){
                schoolType="college";
            }
            else{
                schoolType="grad school";
            }
        }else{
            schoolType="invalid";
        }

        System.out.println("schoolType = " + schoolType);


    }
}
/*
1. Create a class called GradeLevel, Given a number(byte) grade level
determine and print which school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
For Any Other grade: Invalid grade level given
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */