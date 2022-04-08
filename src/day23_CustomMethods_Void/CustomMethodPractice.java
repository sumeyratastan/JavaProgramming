package day23_CustomMethods_Void;

public class CustomMethodPractice {
    public static void main(String[] args) {

        greeting();


        greeting1();


        evenNumbers();


    }
    // create a function that can print hello world 5 times




    //create a function that can print hello cydeo 5 times



    public static void greeting(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello world");
        }

    }


    public static void greeting1(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello Cydeo");
        }
    }



    public static void evenNumbers(){
        //create a functain that can print all the even numbers from 1~10
        for (int i = 2; i <=10 ; i+=2) {
            System.out.print(i+" ");

        }
    }





}
