package day26_MethodOverloading;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class MethodOverloading2 {
    /*
    first method: print sum of 2 int num
    second method: print sum of 3 int num
    third method: print the sum four int num
     */

    public static void main(String[] args) {
        //10,5
        sum2Num(10,5);

        //10,5,5
        sum3Num(10,5,5);

        //10,5,5,20
        sum4Num(10,5,5,20);

        System.out.println("=====================");

        sum(10,5);
        sum(10,5,5);
        sum(10,5,5,20);

        int[] arr1 = {3,2,1};

        char[] arr2 = {'z', 's', 'a'};

        double [] arr3 = {10.5, 55,2, 60.5};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);  // same method name, different parameter

/*
first method can find the sum of the int numbers
second method: can find the sum of two double numbers
 */




    }

    public static void sum2Num(int a, int b){
        System.out.println(a+b);
    }

    public static void sum3Num (int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum4Num (int a, int b, int c, int d ){

        System.out.println(a+b+c+d);
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum(int a, int b, int c, int d){

    }


}
