package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="Java";
        char[] chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));

       for(char each : chars){
           System.out.println(each);
       }

        System.out.println("----------------------------------------------");


       String sentence="Wooden Spoon";
       String[]words=sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------");

        String email="WoodenSpoon@cydeo.com";
        String[] domain=email.split("@");
        System.out.println(Arrays.toString(domain));

        System.out.println("-----------------------------------------");

        String s = "Today is nice day. Today is Monday. Today we learn Java";
        String[]each=s.split("\\. ");
        System.out.println(Arrays.toString(each));












    }
}
