package day29_Wrapper_ArrayList;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {

        String[]arr = {"1", "2.5", "3", "3.5", "4.5" };

        double max = Double.MIN_VALUE;

        for(String each:arr){
            double num = Double.valueOf(each);
            if(num>max){
                max = num;

            }
        }
        System.out.println(max);

        System.out.println("=================");

        String []arr2 = {"100", "2.5", "3", "3.5", "55"};

        double[] numbers = new double[arr2.length]; //[0.0, 0.0, 0.0, 0.0, 0.0]

        for(int i = 0; i<arr.length; i++){
            numbers[i] = Double.parseDouble(arr2[i]);
        }
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[numbers.length-1]);





    }
}
