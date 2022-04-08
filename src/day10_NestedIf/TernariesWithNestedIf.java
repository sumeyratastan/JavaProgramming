package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int score= 10;
        String result = score>=0&&score<=100? ((score<=60? "failed" :"pass")) : "invalid";

        System.out.println(result);





    }
}

