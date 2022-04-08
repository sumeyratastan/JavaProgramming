package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {
        oddOrEven(120);

        ageOfPerson(1990);

        areaOfCircle(4);

        printNumbers(5,20);


    }








    //create a function that can check if a number iss odd or even number
    public static void oddOrEven(int number){
        if(number%2==0){
            System.out.println(number+" is even number");
        }else{
            System.out.println(number+" is odd number");
        }
    }

    //create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age=2022-birthYear;
        System.out.println("Your age is :" + age);
    }


    public static void areaOfCircle(int radius){
        double pi= 3.14;
        double area= pi*radius*radius;
        System.out.println("The area of the circle is :" +area);
    }


    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){

        for (int i = x; i <y ; i++) {
            System.out.print(i+" ");

        }





    }

}
