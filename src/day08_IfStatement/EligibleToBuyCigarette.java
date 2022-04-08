package day08_IfStatement;

public class EligibleToBuyCigarette {
    public static void main(String[] args) {

        byte number =21;
        boolean isEligible = number>=18;

        if(isEligible){
            System.out.println("Eligible");
        }

         boolean isNotEligible =!isEligible;

        if(isNotEligible){
            System.out.println("Not Eligible");
        }




    }
}
/*
1. Given a number (byte) age, write a program that can check if the
person is eligible to buy Cigarettes
 */