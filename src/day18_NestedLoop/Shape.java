package day18_NestedLoop;

public class Shape {
    public static void main(String[] args) {

        String result="";



        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <1; j++) {

                result+="* ";
                System.out.println(result);
            }
        }




    }
}
/*
Use a nested loop to print the following shape
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *
* * * * * * * * * *
 */