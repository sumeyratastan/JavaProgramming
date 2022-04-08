package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2000;

        boolean leapYear = year%4==0;

        if(leapYear){             //2 independent statements
            System.out.println(year+ " is leap year");
        }

        if(!leapYear){
            System.out.println(year+ " is NOT leap year");
        }


        System.out.println("---------------------------------------------");
        if(leapYear){
            System.out.println(year+ " is leap year");  // 1 independent statement
        }else{
            System.out.println(year+ " is NOT leap year");
        }



    }



}

