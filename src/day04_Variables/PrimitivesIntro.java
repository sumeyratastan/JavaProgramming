package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        //age:38 years old
        byte age = 38;


        //weight:160 pounds
       // byte weight = 160;  160 is out of the byte range

        short weight = 160;

        //salary:100000$
       // short salary= 100000; //out of the range

        int salary =100_000; //preferred data type for integer numbers

        long asset = 3_000_000_000L; // when you use long data type always add `L` or`l`

         //tax:0.26
        float tax = 0.26F; // `F` `f`
        double PI =3.14;
        
        // #

        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char ch4 = 15000;
        System.out.println("ch4 = " + ch4);

        char gender = 'F';

        char grade = 'F';

        char yesNo = 'Y';

        System.out.println(yesNo);

       // char ch5 ='AB';
        boolean isEmployeed = true;
        boolean isMarried = false;

        boolean result = 100>300;

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Woodden Spoon";
        String city = "McLean";
        String state = " Virginia";
        String country ="USA";

        System.out.println("name = " + name);



    }
}
