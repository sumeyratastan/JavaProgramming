package day20_Array;

import java.util.Arrays;

public class ReverseIntegers {
    public static void main(String[] args) {
      int[] array = {1,2,3,4,5};

      int[] arr1=new int[array.length];


        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {
            arr1[j]=array[i];

        }
        System.out.println(Arrays.toString(arr1));
         }
}
/*
5.  Write a program that can reverse an array of integers and
returns it as new array
ex:
array = {1,2,3,4,5};
output:
reversedArray = {5,4,3,2,1};
 */