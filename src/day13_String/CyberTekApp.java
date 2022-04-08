package day13_String;

import java.util.Scanner;

public class CyberTekApp {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter username");
        String username=scan.nextLine();

        String str1="Cydeo";

        System.out.println("enter password");
        String password=scan.nextLine();

        String str2="WoodenSpoon";

if(username.equals(str1)&&password.equals(str2)){
    System.out.println("LOGIN");
}else{
    System.err.println("Incorrect username or password");
}


    }
}
/*
8. You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
Ask the user to enter their credentials. If credentials are
matched, your program should print "Logged in."
otherwise print "Incorrect username or password" as error message
Hints: In order to login, both username and password MUST
be correct
you will need to use equals() methodAsk the user to enter their credentials. If credentials are
matched, your program should print "Logged in."
otherwise print "Incorrect username or password" as error message
Hints: In order to login, both username and password MUST
be correct
 */