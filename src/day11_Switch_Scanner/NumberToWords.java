package day11_Switch_Scanner;

public class NumberToWords {
    public static void main(String[] args) {


        int number=2;
        String result=(number>=0&&number<=9)?
                (number==0)?"zero":(number==1)?"one":(number==2)?"two":(number==3)?"three":(number==4)?"four"
                        :(number==5)?"five":(number==6)?"six":(number==7)?"seven":(number==8)?"eight":"nine"

        :"invalid";

        System.out.println(result);




    }


}
/*
2. Write a program that can convert numbers 0~9 to words.
NOTE: MUST use ternary
 */
/*
String result=(version==1.5)?"cupcake":(version==1.6)?"donut"
    :(version==2.1)?"eclair":(version==2.2)?"froyo":(version==2.3)?
    "Gingerbread":(version==3.1)?"Honeycomb":(version==4.0)?"Ice Cream Sandwich":(version==4.1)?"Jelly Bean":(version==4.4)?"KitKat":(version==5.0)?"Lollipop":(version==8.0)?"Oreo":"Pie";
 */