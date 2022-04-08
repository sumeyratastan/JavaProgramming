package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1=200.0,
              n2=400.0;

        char operator ='-';

        boolean valid =operator=='+'||operator=='-'||operator=='*'||operator=='/';


        if (valid){
            switch (operator){

                case '+':
                    System.out.println(n1+n2);
                    break;

                case '-':
                    if(n1>n2){
                        System.out.println(n1-n2);
                    }else{
                        System.out.println(n2-n1);
                    }

                    break;

                case '*':
                    System.out.println(n1*n2);
                    break;

                default:
                    if(n1>n2){
                        System.out.println(n1/n2);

                    }else{
                        System.out.println(n2/n1);
                    }


            }

        }else{
            System.err.println("Invalid Operator: "+operator);
        }

    }
}
