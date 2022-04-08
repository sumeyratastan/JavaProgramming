package week03;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your score");
        int score= scan.nextInt();
        String grade;

        if (score>=90&&score<=100) {
            grade = "A";
        }
else if (score<90&&score>=80){
    grade = "B";
        }
else if (score<80 && score >=70){
    grade= "C";
        }
else if(score<70 && score >=60){
    grade="D";
        }
else{
    grade="F";
        }
        System.out.println("grade = " + grade);




    }
}
