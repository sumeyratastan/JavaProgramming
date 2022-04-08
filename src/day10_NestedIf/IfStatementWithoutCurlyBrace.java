package day10_NestedIf;

public class IfStatementWithoutCurlyBrace {
    public static void main(String[] args) {

        int number=8;
        String name="";

        if(number>0&&number<=12)

            if(number==1)
                name="january";

            else if(number==2)
                name="february";

            else   if(number==3)
                name="march";

            else   if(number==4)
                name="april";

            else   if(number==5)
                name="may";

            else   if(number==6)
                name="june";

            else   if(number==7)
                name="july";

            else  if(number==8)
                name="august";

            else if(number==9)
                name="september";

            else if(number==10)
                name="october";

            else if(number==11)
                name="november";

            else
                name="december";



        else
            name="invalid";


        System.out.println("name = " + name);








    }
}
