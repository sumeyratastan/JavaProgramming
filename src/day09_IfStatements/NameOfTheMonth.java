package day09_IfStatements;

public class NameOfTheMonth {
    public static void main(String[] args) {
        int number=6;
        String month;
        if(number==1){
            month="Jan";
        }
       else if(number==2){
            month="Feb";
        }
       else if(number==3){
            month="March";
        }
        else if(number==4){
            month="April";
        }
       else  if(number==5){
            month="May";
        }
       else if(number==6){
           month="June";
        }
       else if (number == 7){
           month="July";
        }
        else if (number==8){
            month="August";
        }
        else if(number==9){
            month="Sept";
        }
        else if(number==10){
            month="October";
        }
        else if(number==11){
            month="Novem";
        }else{
            month = "Decem";
        }
        System.out.println("month = " + month);


    }


}
