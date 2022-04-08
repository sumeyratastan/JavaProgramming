package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 7};
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));

        double[]array2={1.5,2.5,3.5,4.5,5.5,5.5,4.5,1.5};
        double[] unique2=uniqueElement(array2);
        System.out.println(Arrays.toString(unique2));

        char[]array3={'A','B','B','C','D','D'};
        char[]unique3=uniqueElement(array3);
        System.out.println(Arrays.toString(unique3));

        String[]array4={"sila","idil","idil","kagan","kagan","kagan","sumeyra"};
        String[]unique4=uniqueElement(array4);
        System.out.println(Arrays.toString(unique4));


    }


    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array) {
        int[] result = {};
        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }

        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static double[] uniqueElement(double[] array) {
        double[] result = {};
        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static char[] uniqueElement(char[] array) {
        char[] result = {};
        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

    // returns the unique elements of the array as a new array
    public static String[] uniqueElement(String[] array) {
        String[] result = {};
        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                result = ArraysUtility.addElement(result, each);
            }
        }
        return result;
    }

















}
