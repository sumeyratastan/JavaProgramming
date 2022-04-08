package day15_ForLoop;

import java.util.Scanner;

public class Codex {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.nextLine();

      if(word.charAt(0)=='x'){
          word=word.replaceFirst("x","a");
      }


        System.out.println(word);

    }
}
