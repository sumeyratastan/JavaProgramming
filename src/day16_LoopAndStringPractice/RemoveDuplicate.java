package day16_LoopAndStringPractice;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str="AABBACC";
        String result="";

        for (int i = 0; i <=str.length()-1 ; i++) {
            String ch=""+ str.charAt(i);

            if(!result.contains(ch)){
                result+=ch;
            }



        }


        System.out.println(result);

    }
}
/*
Write a program that can remove the duplicated characters from a
        String
        Ex:
        input:
        AABBCCBC
        Output:
        ABC
 */