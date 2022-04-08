package day10_NestedIf;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int number=100;
        String members="";

//boolean validNumber=number==50 || number==75 || number==100;
        //if(validNumber)

        if(number==50 || number==75 || number==100){

            if(number==50){
                members="20 crew, 30 passengers";
            }

            else if (number==75){
                members="25 crew, 50 passengers";
            }

            else{
                members="30 crew, 70 passengers";
            }


        }else{
            System.out.println("Number is invalid");
        }


        System.out.println(members);




    }
}
/*
2. Create a class called CrewAndPassangers, Given a number of people on
the ship (int number), determine how many need to be crew members and
how many can be passengers. Print how many of each type there should
be.
Total: 50  ====> 20 crew, 30 passengers
Total: 75  ====> 25 crew, 50 passengers
Total: 100 ====> 30 crew, 70 passengers
Any other number of people on the ship is not valid
NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT
STATEMENT
 */