package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number between 1 to 7: ");
        int num= input.nextInt();

String result="";

if(num>=1&&num<=7){
    result= (num==1)?"monday":(num==2)?"tuesday":(num==3)?"wednesday":(num==4)?"thursday":(num==5)?"friday"
            :(num==6)?"saturday":"sunday";

}else{
    result="invalid";
}


        System.out.println(result);

input.close();

    }
}
