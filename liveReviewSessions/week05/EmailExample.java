package week05;

import java.util.Locale;
import java.util.Scanner;

public class EmailExample {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter email");
        String email=scan.nextLine();

        int indexOf_=email.indexOf("_");
        int indexOfAtSign=email.indexOf("@");
        int indexOfDot=email.indexOf(".");

        String firstName= email.substring(0,indexOf_);
        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();

        String secondName=email.substring((indexOf_)+1,indexOfAtSign);
        secondName=secondName.substring(0,1).toUpperCase()+secondName.substring(1).toLowerCase();

        String domain=email.substring((indexOfAtSign)+1,indexOfDot);
        domain=domain.substring(0,1).toUpperCase()+domain.substring(1).toLowerCase();


        System.out.println("firstName = " + firstName);
        System.out.println("secondName = " + secondName);
        System.out.println("domain = " + domain);

    }
}
