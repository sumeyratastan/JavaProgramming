package day24_CustomMethod_Return;

import java.util.Arrays;

public class ReversedArray {


    public static void main(String[] args) {

        int[]array={1,2,3,4,5};
        int[]result=reversed(array);
        System.out.println(Arrays.toString(result));



    }

    public static int[] reversed(int[]array){
        int[]result=new int[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++]=array[i];


        }
        return result;
    }






}
/*
4. create a method that return the reversed array
{1,2,3,4,5} === >
{5,4,3,2,1}
 */