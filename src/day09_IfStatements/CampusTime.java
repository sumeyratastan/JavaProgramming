package day09_IfStatements;

public class CampusTime {
    public static void main(String[] args) {

        int time = 23; //1~24

if(time>7&&time<24){
    System.out.println("Open");
}

else if (time<=0||time>=25){
    System.out.println("invalid");
}else
    System.out.println("close");
    }
}
/*
1. Create a class called CampusTime, an integer variable named time is
given with a number between 1~24 has been initialized, write a program
that can find out if the campus is open or not. Campus is open from 8
am(8) to 11 pm (23) If user enters a time within the open time they
should see message: “open”  but if the time entered is outside of
operating hours they should see: “ closed”
 */