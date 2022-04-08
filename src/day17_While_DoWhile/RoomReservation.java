package day17_While_DoWhile;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to reserve a room");
        String answer1 = scan.nextLine();

        while (!(answer1.equalsIgnoreCase("yes") || answer1.equalsIgnoreCase("no"))) {
            System.out.println("please re enter(yes-no)");
            answer1 = scan.nextLine();
        }
        if (answer1.equalsIgnoreCase("yes")) {
            System.out.println("which type of room you want to reserve?");
            String answer2 = scan.nextLine();
            while (!(answer2.equalsIgnoreCase("King Bed")||answer2.equalsIgnoreCase("Queen Bed")||answer2.equalsIgnoreCase("Single Bed"))){
                System.out.println("Please re-enter(King-Queen-Single");
                answer2 = scan.nextLine();
            }
            if (answer2.equalsIgnoreCase("King Bed")) {
                System.out.println("King Bed ==> 120$");
            }else if (answer2.equalsIgnoreCase("Queen Bed")) {
                System.out.println("Queen Bed ==> 100$");
            }else if (answer2.equalsIgnoreCase("Single Bed")) {
                System.out.println("single Bed ==> 80$");
            }
        }

    if(answer1.equalsIgnoreCase("no")){
        System.out.println("Have a nice day");



    }


}
    }





/*
5. Create a class called RoomReservation, write a program for the room
reservation, your program asks the user wants to reserve a room.
if user entered yes, then ask which type of room the user
wants to reserve. if user entered no, print "have a nice day"
(if user entered any invalid answer (other
than yes/no) ask user to reenter until user provides a valid entry)
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
the program should be able to display the room he/she reserved
and total price of the room.
(if the user selected an invalid room, ask the user to
reselect the room until user provides a valid entry)
 */