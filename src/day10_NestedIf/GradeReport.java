package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        int score=66;

        if(score>=0&&score<=100){

            if(score>=90){
                System.out.println("excellent");
            }
            else if(score>=80){
                System.out.println("great");
            }
            else if(score>=70){
                System.out.println("good");
            }
            else if(score>=60){
                System.out.println("passed");
            }

            else {
                System.out.println("failed");
            }





        }else{
            System.out.println("invalid");
        }


        System.out.println("-------------------------------------------------");
        int score1=66;
        String result="";//temporary
        if(score1>=0&&score1<=100){



        System.out.println(result);

        if(score1>=90){
           result="excellent";
        }
        else if(score1>=80){
            result="great";
        }
        else if(score1>=70){
            result="good";
        }
        else if(score1>=60){
           result="passed";
        }

        else {
            result="failed";
        }

    }else{
        result="invalid";
    }


        System.out.println("result = " + result);



















}
}
