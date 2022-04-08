package day07_Operators;

public class Castings {
    public static void main(String[] args) {
        float avaragrScore = 20.5f; //explicit cast.
        byte num1 = (byte) avaragrScore;//explicit cast
        short num2 = (short) avaragrScore;//explicit cast
        int num3 = (int) avaragrScore;//explicit cast
        long num4 = (long) avaragrScore;//explicit cast
        float num5 = avaragrScore; //no casting
        double num6 = avaragrScore;//implicit cast

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);






    }


}
/*
1. create a class named Castings
1.1 declare a variable of float named averageScore and
initialize it to 20.5
1.2 declare the following variables and assign averageScore to
each of them:
byte num1;
short num2;
int num3;
long num4;
float num5
double num6;
  smaller to large = implicit casting
  larger to small = explicit




 */