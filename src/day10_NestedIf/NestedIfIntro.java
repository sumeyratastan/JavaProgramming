package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score=400;

        if(score>=0&&score<=100){ //if the score is valid

            if(score>=60){
                System.out.println("Pass");
            }
            else{
                System.out.println("Failed");
            }
        }else{//if the score is not valid
            System.out.println("Invalid");
        }


        System.out.println("-----------------------------------");

        int age =25;
        boolean hasId= false;

        if(hasId){


            if (age>=21){
                System.out.println("Eligible to buy alcohol");
            }else{
                System.out.println("Not Eligible to buy alcohol");
            }



        }
       else{
            System.out.println("you must have ID to buy alcohol");
        }

        System.out.println("---------------------------------------------");

       int number=25;

       if(number>=1&&number<=7){

          if(number==1){
              System.out.println("monday");
          }
           else if(number==2){
              System.out.println("tuesday");
          }
           else if(number==3){
              System.out.println("wednesday");
          }
           else if (number==4){
              System.out.println("thursday");
          }
           else if(number==5){
              System.out.println("friday");
          }
           else if(number==6){
              System.out.println("saturday");
          }
           else{
              System.out.println("sunday");
          }




       }else{
           System.out.println("invalid number");
       }





    }
}
