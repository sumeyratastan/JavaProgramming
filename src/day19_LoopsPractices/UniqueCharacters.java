package day19_LoopsPractices;

public class UniqueCharacters {
    public static void main(String[] args) {

      String  str = "aabccdeef";
      String result="";//bdf

        for (int j = 0; j <str.length() ; j++) {
            char ch=str.charAt(j);
            int count=0;
            for (int i = 0; i <str.length() ; i++) {//compares the character.
                char each=str.charAt(i);
                if(ch==each){
                    count++;
                }
            }

          if(count==1){//if the frequency of the characters is 1 , then the character is unique
              result+=ch;
          }

        }


        System.out.println(result);






    }
}
/*
2. Write a program that can find the unique characters from a string
without using indexOf() and lastIndexOf() methods
Ex:
str = "aabccdeef";
output:
bdf
 */