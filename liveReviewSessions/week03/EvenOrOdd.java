package week03;

public class EvenOrOdd {
    public static void main(String[] args) {
        int number = 100;

        boolean condition = number%2==0;

        if(condition){
            System.out.println("The number is EVEN");
        }else{
            System.out.println("The number is ODD");
        }

    }
}
