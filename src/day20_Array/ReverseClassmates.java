package day20_Array;

import java.util.Arrays;

public class ReverseClassmates {
    public static void main(String[] args) {

        String[] classmates={"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};


        for (String each : classmates) {
            String reverse="";
            for (int i = each.length()-1; i >=0 ; i--) {
                reverse+=each.charAt(i);

            }

            System.out.println(reverse);
        }






    }
}
/*
2. create string array, and store the names of your  class mates (10)
reverse each students names and print them in separate lines
ex:
arr = {java, python, c#}
output:
avaJ
nohtyp
#c
 */