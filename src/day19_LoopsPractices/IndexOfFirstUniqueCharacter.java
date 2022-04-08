package day19_LoopsPractices;

public class IndexOfFirstUniqueCharacter {
    public static void main(String[] args) {
        String str="aaabccdeff";
        String result="";

        for (int j = 0; j < str.length(); j++) {
            char ch=str.charAt(j);
            int count=0;
            for (int i = 0; i < str.length(); i++) {
                if(ch==str.charAt(i)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(str.indexOf(ch));
                break;
            }
        }

    }
}
/*
4. Write a program that can return the index number of the first unique character.
 */