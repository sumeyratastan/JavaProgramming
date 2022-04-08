package day13_String;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your first name");
        String first=scan.next();

        System.out.println("Enter your second name");
        String second= scan.next();

        char f=first.charAt(0);
        char s=second.charAt(0);

        String initial= f + "." + s;

        System.out.println("initial = " + initial);


        scan.close();
    }
}
