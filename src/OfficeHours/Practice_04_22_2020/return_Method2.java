package OfficeHours.Practice_04_22_2020;


import java.util.Arrays;

public class return_Method2 {
    //write a return method that can return the second maximum number from any int array

    public static void main(String[] args) {
        int[] arr = {100,40,500,50,30,100,-5,-100};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int lastIndexNumber = arr.length-1;
        int secondLastIndexNum = lastIndexNumber-1;  // arr.length-2
        //                        arr.length-1  - 1 =  arr.length-2

        int secondMaxNum = arr[secondLastIndexNum];
        System.out.println(secondMaxNum);

        System.out.println("=================");
        int[] arr2 = {1,2,3,4,5,6,7,8};
        int num = secondMax(arr2);
        System.out.println(num);
    }

    public static int secondMax(int [] arr){
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int lastIndexNumber = arr.length-1;
        int secondLastIndexNum = lastIndexNumber-1;  // arr.length-2
        //                        arr.length-1  - 1 =  arr.length-2

        int secondMaxNum = arr[secondLastIndexNum];
        return  secondMaxNum;
    }
}
