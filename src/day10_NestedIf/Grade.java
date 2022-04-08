package day10_NestedIf;

public class Grade {
    public static void main(String[] args) {

        char grade ='C';

        String message="";

        if(grade=='A' || grade=='B' ||grade=='C'||grade=='D' ||grade=='F'){

            if(grade=='A'){
               message=("excellent");
            }else if(grade=='B'){
               message=("great job");
            }else if(grade=='C'){
               message=("good");
            }else if(grade=='D'){
                message=("passed");
            }else{
               message=("failed");
            }


        }else{
            message=("invalid");
        }


        System.out.println(message);


    }
}
/*
Create a class called Grade, a char variable named grade is given.
write a program to print the following messages:
'A': excellent
'B': great job
'C': good
'D': passed
'F': failed
other wise: invalid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */