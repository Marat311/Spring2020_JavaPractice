package day22_Arrays_Loops;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        // 1. sort array in ascending
        //2. reverse array that's sorted in ascending to sort in descending
        int[] arr ={10,78,2,-1,500,70};
        Arrays.sort(arr);   // sorts in ascending

        System.out.println(Arrays.toString(arr)); // [-1, 2, 10, 70, 78, 500]

        int[] revArr = new int [arr.length];

        int j = arr.length-1;
        for(int i = 0; i<arr.length; i++){  // sort in descending
            revArr[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(revArr));  //  [500, 78, 70, 10, 2, -1]




    }
}
