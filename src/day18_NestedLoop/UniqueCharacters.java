package day18_NestedLoop;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str="aabccdeef";
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
if(str.indexOf(ch)==str.lastIndexOf(ch)){
    result+=ch;
}

        }

        System.out.println(result);

    }
}
/*
5. Write a program that can find the unique characters from a string
without using index() and lastIndexOf() methods
Ex:
str = "aabccdeef";
output:
bdf
Hint: if you find out how to find the frequency of one
character, then you can repeat it for the remaining characters to find the
frequency.
if frequency of a character == 1  =========>
unique
 */