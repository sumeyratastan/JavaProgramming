package utilities;

public class Quiz {
    public static void main(String[] args) {
       /* int a=0;
        do{

            a=a++ + --a -(a%3);
        }while(++a<4);

        System.out.println(a);
*/

        String str= "The whole time it was raining.";
        do{

            System.out.print(str.charAt(0));//T -whole time it was raining.
            str=str.substring(3);
        }while(!str.isEmpty());



    }
}
