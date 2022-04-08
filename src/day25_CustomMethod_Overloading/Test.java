package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {



        String str="Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("-------------------------------");


        String str1="Wooden Spoon";

        String reverse=StringUtility.reverse(str1);

        System.out.println(reverse);


        System.out.println("--------------------");

        String word="Civic";
       boolean palindrome=StringUtility.isPalindrome(word);
        System.out.println(palindrome);

        System.out.println("---------------------------------");


        String[]names={"Anna","Java","Python","racecar","Mom","Cydeo"};
       int count=0;
        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                count++;
            }

        }
        System.out.println(count);

        System.out.println("-------------------");


        String word1="level";
        String word2="evell";

        boolean anagram=StringUtility.anagram(word1,word2);
        System.out.println("anagram = " + anagram);


        System.out.println("-------------------------------");

        String word3="aaabbcddfffg";
        String result=StringUtility.removeDuplicates(word3);
        System.out.println(result);



    }



}
