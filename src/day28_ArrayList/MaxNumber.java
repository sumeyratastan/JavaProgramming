package day28_ArrayList;

import java.util.ArrayList;

public class MaxNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        int max= list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>max){
                max= list.get(i);
            }

        }
        System.out.println("max = " + max);


    }
}
/*
5. Write a program that can find the maximum number from an ArrayList of
integers
Ex:
list = [1,2,3,4,5];
output:
5
 */