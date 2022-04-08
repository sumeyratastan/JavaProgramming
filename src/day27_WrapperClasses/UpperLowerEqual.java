package day27_WrapperClasses;

public class UpperLowerEqual {
    public static void main(String[] args) {

        String str="JAVA java";

        int totalUpper=0;
        int totalLower=0;

        for(int i=0; i<str.length(); i++){
            char each=str.charAt(i);
            if(Character.isUpperCase(each)){
                totalUpper++;
            }
            if(Character.isLowerCase(each)){
                totalLower++;
            }
        }

  boolean result= totalLower==totalUpper;
        System.out.println(result);

    }
}
/*
4. Write program that returns true if the total number of upper case
characters are equal to total number of Lowercase characters of a
string
Ex:
str = "JAVA java";
output:
true
 */