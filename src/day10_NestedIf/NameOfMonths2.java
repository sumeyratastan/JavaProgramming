package day10_NestedIf;

public class NameOfMonths2 {
    public static void main(String[] args) {
        int n = 8;

        String months= n>0&&n<=12? ((n==1)? "Jan" :(n==2)? "feb" :(n==3)? "march" :(n==4)? "april" :(n==5)? "may" :(n==6)? "june"
                :(n==7)? "july" :(n==8)?"august" :(n==9)? "september" :(n==10)?"october" :(n==11)?"nov"
                :"december") :"invalid";
        System.out.println(months);

//nested & ternaries







    }
}
