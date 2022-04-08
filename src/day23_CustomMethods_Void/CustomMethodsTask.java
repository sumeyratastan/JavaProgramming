package day23_CustomMethods_Void;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class CustomMethodsTask {

    public static void main(String[] args) {
        oddNumbers1_100();

        System.out.println();

        evenNumbers1_100();

        System.out.println();

        eligibleToBuyAlcohol(54);

        System.out.println();

        eligibleToVote(22,"usa");

        System.out.println();

        gradeOfTheStudent(55);
        System.out.println();

        areaOfCircle(6);
        System.out.println();
        areaOfSquare(6);
        System.out.println();
        dollarToEuro(1);
        System.out.println();
        dollarToLira(1);
        System.out.println();
        kiloTolb(1);
        System.out.println();
        posNegZero(-9);
        System.out.println();
        printEachChar("sumeyra");
        System.out.println();

        int []numbers={1,2,3,4,5};
        printEachElement((numbers));

        System.out.println();

        System.out.println(Arrays.toString(numbers));

        mathOperator(6,3,'&');
        System.out.println();

        fullName("sUmEyRa","tastan");
        System.out.println();

        anagram("silent","listen");

    }






    public static void oddNumbers1_100(){
        for (int i = 2; i <= 100; i+=2){
            System.out.print(i+" ");
        }
    }


    public static void evenNumbers1_100(){
        for (int i = 1; i <=100 ; i+=2) {
            System.out.print(i+" ");
        }
    }


    public static void eligibleToBuyAlcohol(int age){
        if(age>=0&&age<=120){
            if(age>=18){
                System.out.println("Eligible");
            }else{
                System.out.println("Not Eligible");
            }
        }

    }


    public static void eligibleToVote(int age,String citizen){
        if(age>18&&citizen.equalsIgnoreCase("USA")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }


    public static void gradeOfTheStudent(int score){
        char grade;

        if(score>90){
            grade='A';
        }

        else if(score>80&&score<90){
            grade='B';
        }

        else  if(score>70&&score<80){
            grade='C';
        }

        else  if(score>60&&score<70){
            grade='D';
        }

        else {
            grade = 'F';
        }
        System.out.println("grade = " + grade);


    }


    public static void areaOfCircle(int radius){
        double pi= 3.14;
        double area= pi*radius*radius;
        System.out.println("The area of the circle is :" +area);
    }


    public static void areaOfSquare(int side){
        int area=side*side;
        System.out.println(area);
    }



    public static void dollarToEuro(int dollar){
        double euro=0.916037;
        double convert=dollar*euro;
        System.out.println(convert);
    }



    public static void dollarToLira(int dollar){
        double lira=14.65;
        double convert=dollar*lira;
        System.out.println(convert);
    }


    public static void kiloTolb(int kilo){
        double lb=2.20462;
        double convert=kilo*lb;
        System.out.println(convert);
    }


    public static void posNegZero(int number){
        if (number>0){
            System.out.println("Positive");
        }else if(number==0){
            System.out.println("Zero");
        }else{
            System.out.println("Negatif");
        }
    }


    public static void printEachChar(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i)+" ");
        }
    }


    public static void printEachElement(int[]numbers){
        for (int each : numbers) {
            System.out.print(each+" ");
        }

    }


    public static void mathOperator(int num1,int num2,char operator){
        if(operator=='+'||operator=='-'||operator=='*'||operator=='/'){
           if(operator=='+'){
               System.out.println(num1+num2);
           }else if(operator=='-'){
               System.out.println(num1-num2);
           }else if(operator=='*'){
               System.out.println(num1*num2);
           }else{
               System.out.println(num1/num2);
           }
        }else{
            System.out.println("Invalid operator");
        }
    }


    public static void fullName(String firstName,String lastName){
        firstName=firstName.toUpperCase().charAt(0)+firstName.substring(1).toLowerCase();
        lastName=lastName.toUpperCase().charAt(0)+lastName.substring(1).toLowerCase();
        System.out.println(firstName+" "+lastName);
    }


    public static void anagram(String first,String second){
        char[] each1=first.toCharArray();
        char[] each2=second.toCharArray();

        System.out.println(Arrays.toString(each1));
        System.out.println(Arrays.toString(each2));

        Arrays.sort(each1);
        Arrays.sort(each2);

        System.out.println();

        System.out.println(Arrays.toString(each1));
        System.out.println(Arrays.toString(each2));


        boolean anagram=Arrays.equals(each1,each2);
        System.out.println("anagram = " + anagram);
            }



}
/*
Tasks:
1. create a method that can print odd numbers between 1~100 in a
same line saperated by space
2. create a method that can print even numbers between 1~100 in a
same line saperated by space
3. create a method that can check if a person is eligible to buy
alcohol
4. create a method that can check if a person is eligible to vote
Ex:
eligibleToVote(19, "USA");
output:
You are not eligible to vote!
5. create a method that can calculate the grade of the student based
on the score
6. create a method that can calculate the area of a circle
7. create a method that can calculate the area of a square
9. create a method that can convert dollar to euro
10. create a method that can can convert dollar to lira
11. create a method that can convert kg to lb
12. create a method that can if the given integer is positive,
negative or zero
13. create a method named printEachChar that can print each
characters of a string
14. create a method named printEachElement that can print each
elements of an integer array
15. create a method named calculator that passes three arguments
(num1, num2, mathOperator), prints the calculation result
16.  write a method that can print out the full name of a person in
regular format
ex:
fullName("cYdEo", "SCHOOL");
output:
"Cydeo School"
17. create a method that can check if two strings are anagram
ex:
anagram("silent", "listen")
output:
silent and listen are anagram
 */