package day18_NestedLoop;

public class FrequencyOfTheCharacters {
    public static void main(String[] args) {

        String str="aabcccd";
        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        String str1="";

        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a'){
                countA++;
            }

            if(str.charAt(i)=='b'){
                countB++;
            }

            if(str.charAt(i)=='c'){
               countC++;
            }

            if(str.charAt(i)=='d'){
                countD++;
            }






        }

        System.out.println("a"+ countA + "b" + countB + "c" + countC + "d" + countD);


    }
}
/*
4. Write a program that can find the frequency of the characters from a
string
 Ex:
str = "aabcccd";
output:
a2b1c3d1
Hint: if you find out how to find the frequency of one
character, then repeat it for all the remaining characters
 */