package day14_String;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your account number");
        String number=scan.next();

        if(number.charAt(0)=='2'){
           if(number.length()==7){
               System.out.println("valid");
           }

        }else if(number.charAt(0)=='5'){
            if(number.length()==5){
                System.out.println("valid");
            }
        }else{
            System.err.println("invalid account number");
        }

    }
}
/*
7. Create a class called AccountNumber.
Ask the user enter an account number (String). Check if these
account number is valid.
> If the account number begins with a â2â the account
number should be 7 characters long
> If the account number begins with a â5â the account
number should be 10 characters long
â> If the account number does not begin with a 2 or a 5 OR
the account number lengths
do not meet the expected results print âInvalid
account numberâ
 */