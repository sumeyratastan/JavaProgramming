package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int number=2;
        String has28days = " number==2";
        String has30days =" number==4||number==6||number==9||number==11";
       String has31days = "number==1||number==3||number==5||number==7||number==8||number==10||number==12";

       String result="";

        switch(number){
            case 1:  case 3:  case 5:  case 7: case 8:  case 10: case 12:

                result="has 31 days";

                break;


            case 2:
                result="has 28 days";
                break;




            case 4:  case 6: case 9: case 11:
                result="has 30 days";
                break;



              default:
                result="invalid";

                break;


        }

        System.out.println(result);


    }
}
/*
4. NumberOfDays
28 Days: 2
30 days: 4, 6, 9, 11
31 days: 1, 3, 5, 7, 8, 10, 12
If(1~12){
}else{
Invalid
}
 */