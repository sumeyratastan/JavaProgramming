package day12_Scanner;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("How many total shares they have already?");
        int num1= scan.nextInt();



        System.out.println("how much their total value in the stock market");
        double total = scan.nextDouble();
        scan.nextLine();

        double total1=num1*total;

        System.out.println("enter the name of the company");
        String name= scan.nextLine();

        if(num1>0){
            System.out.println("Your total stock market holding is $"+total1+"  which is made up of "
                    +num1+ " shares. " + name + " is your company holdings");

        }else{
            System.err.println("invalid");
        }



    }
}
/*
7. StockMarket task:
- Ask the user how many total shares they have already? (int)
-> If the user gives 0 or give a negative number none of the
rest condition should be executed
- Ask the user how much their total value in the stock market is
(double)
- Ask the user to enter the name of the company they have the
most shares in (String, multiple words)
- Print in the following format:
Ex:
inputs: 100, 25000, Apple INC
"Your total stock market holding is $25000 which is made up of
100 shares. Apple INC is your company holdings"
 */