package day09_IfStatements;

import java.util.Scanner;

public class CharacterIdentity {
    public static void main(String[] args) {

      char characters='3';

if((characters>64&&characters<91)||(characters>96&&characters<123)){
    System.out.println("Alphabetic Character");
}
else if(characters>47&&characters<58){
    System.out.println("Digit");
}
else{
    System.out.println("Special Character");
}






    }
}
/*
4. Create a class called Character Identity, and write a program that can
identify if the given character is a digit or Alphabetic Character(A~Z
or a~Z) or a special character
Ex:
ch = '@'
output:
Special Character
HINT: You may wanna check out the numbers of the
chracters on ASCII table
 */