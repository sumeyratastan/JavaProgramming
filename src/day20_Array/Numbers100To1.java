package day20_Array;

import java.util.Arrays;

public class Numbers100To1 {
    public static void main(String[] args) {

        int[]numbers=new int[101];
        for (int i = numbers.length - 1,j=0; i >= 0; i--,j++) {
            numbers[j]=i;
        }


        System.out.println(Arrays.toString(numbers));

    }
}
/*
2. create an array that has the numbers 100 to 1
 */