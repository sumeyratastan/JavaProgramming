package day14_String;

import java.util.Scanner;

public class Really {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word");

        String word=scan.next();

       String lastTwoLetters= word.substring(word.length()-2);

       if(lastTwoLetters.equals("ly")){
           System.out.println("really");
       }else{
           System.out.println("never mind");
       }






    }
}
/*
2. ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"
 */