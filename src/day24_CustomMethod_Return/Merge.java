package day24_CustomMethod_Return;

import java.util.Arrays;

public class Merge {


    public static void main(String[] args) {

        int[]arr1={1,2,3};
        int[]arr2={4,5};
        int[]arr3=merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));


    }

    public static int[] merge(int[]arr1,int[]arr2){
        int [] result= new int[arr1.length+arr2.length];
        int i=0;
        for (int each : arr1) {
            result[i++]=each;
        }
        for (int each : arr2) {
            result[i++]=each;
        }
        return result;
    }




}
/*
5. create a method that can merge two arrays and returnj the new
array
arr1 = {1,2,3}
arr2 = {4,5}
{1,2,3,4,5}
 */