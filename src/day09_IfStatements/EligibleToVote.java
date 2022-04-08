package day09_IfStatements;

import static java.util.Locale.UK;

public class EligibleToVote {
    public static void main(String[] args) {
        int age = 19;
        String citizen ="USA";


        if (age>=18 && citizen== "USA" ){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }


    }
}
