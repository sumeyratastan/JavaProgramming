package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number=7;
      switch (number){ //1,2,3,4,5,6,7. you can use just  " =="
          case 1:
              System.out.println("monday");
             break;
          case 2 :
              System.out.println("tuesday");
          break;//exits switch after executing the case block
          case 3:
              System.out.println("wednesday");
          break;
          case 4 :
              System.out.println("thursday");
          break;
          case 5:
              System.out.println("friday");
          break;
          case 6:
              System.out.println("saturday");
            break;
          case 7:
              System.out.println("sunday");
          break;

          default:// only gets executed if non of the case blocks matching
              System.out.println("invalid");
           break;//we dont need to give break if the default block is in the end.



      }






        /*if(number==1){
            System.out.println("monday");
        }
        */


    }
}
