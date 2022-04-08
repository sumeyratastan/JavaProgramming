package day08_IfStatement;

public class GradeLevel {
    public static void main(String[] args) {

        byte number =17;

        boolean GradSchool = number>=17&&number<=18;
        boolean College = number>=13 && number<=16;
        boolean HighSchool = number>= 9 && number<=12;
        boolean MiddleSchool = number>=6 && number<=8;
        boolean ElementarySchool =number>=1 &&number<=5;

        if(ElementarySchool){
            System.out.println("Elementary School");
        }

        if(MiddleSchool){
            System.out.println("Middle School");
        }

        if (HighSchool){
            System.out.println("High School");
        }

        if(College){
            System.out.println("College");
        }

        if (GradSchool){
            System.out.println("Grad School");
        }


    }
}
/*
Given a number(byte) grade level determine and print which
school type someone is in.
grade level and types are:
1-5: Elementary school
6-8: Middle school
9-12: High school
13-16: College
17-18: Grad School
Assume that the given number is 1 ~ 18
 */