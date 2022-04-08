package day17_While_DoWhile;

import java.util.Scanner;

public class DivisibleBy3By5By15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int n= scan.nextInt();

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 0; i < n; i++) {
            if(i%3==0 && i%15==0 ){
                divisibleBy15+=i+" ";
            }

            if(i%3==0 && i%15!=0){
                divisibleBy3+=i+" ";
            }
            if(i%5==0 && i%15!=0){
                divisibleBy5+=i+" ";
            }

        }
        System.out.println("divisibleBy3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy15 = " + divisibleBy15);

    }
}
