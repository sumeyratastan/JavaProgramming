package week03;

public class DivisionAndRemainderPractice {
    public static void main(String[] args) {


       int inputSeconds=40000;
       int hours,minute,second;

        second= inputSeconds%60;
        minute=(inputSeconds/60)%60;
         hours = inputSeconds/3600;


         String clock ="Hours :" +hours+" Minute : "+minute+" Second : "+second;
        System.out.println("clock = " + clock);


    }
}
