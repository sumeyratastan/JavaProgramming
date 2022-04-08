package day14_String;

public class StringMethods {
    public static void main(String[] args) {

        String str1="           batch 25          ";
        str1=str1.trim();//"batch 25"

        System.out.println(str1);

        //trim() ====> remove the white spaces which we dont use(unused). before and after text.

        System.out.println("------------------------------------------------------------");

        String str2="Cydeo School";
        int n1=str2.indexOf("h");

        System.out.println("n1 = " + n1);


        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3="Java Programming Language";
        int n3=str3.indexOf("ang");
        System.out.println("n3 = " + n3);


        int n4=str3.indexOf("ge");
        System.out.println("n4 = " + n4);

        int n5=str3.lastIndexOf("g");
        System.out.println("n5 = " + n5);


        System.out.println("---------------------------------------------------------");

        String s = "Java Nova Cava Wawa orange";
        int firstA= s.indexOf("a");
        System.out.println("firstA = " + firstA);
        int lastA=s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);
        int secondA=s.indexOf("a ");
        System.out.println("secondA = " + secondA);

        int thirdA=s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);

      // int fourthA=s.indexOf("ava W");

       //int fourthA=s.lastIndexOf("av");
        int fourthA=s.indexOf("Ca")+1; //!!!IMPORTANT
        System.out.println("fourthA = " + fourthA);

      //  int fifthA=s.indexOf("a W");
       // int fifthA=s.lastIndexOf("a W");
        int fifthA=s.lastIndexOf("va")+1;
        System.out.println("fifthA = " + fifthA);


        //int sixthA=s.lastIndexOf("aw");
        int sixthA=s.lastIndexOf("Wa")+1;
        System.out.println("sixthA = " + sixthA);

        int seventh=s.lastIndexOf("a ");
        System.out.println("seventh = " + seventh);

        int eighth= s.lastIndexOf("a");
        System.out.println("eighth = " + eighth);

        int number=s.indexOf("o")-1;
        System.out.println("number = " + number);
    }
}
