package day21_MultiDemensionalArrays;

import java.text.DecimalFormat;

/*
write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10

 */
public class AvarageNumber {
    public static void main(String[] args) {
        DecimalFormat DF = new DecimalFormat("0.00");
     int [] arr = {10, 20, 30, 40, 50};   // (10+20+30+40+50)/5=30.0
     // average: sum of all numbers/ length

        int length = arr.length; // total number of the elements
        int sum = 0;

        for(int i = 0; i<length; i++){
            int eachnum = arr[i];
            sum += eachnum;
        }

        double average = sum/(double)length;

        System.out.println("Sum numbers: "+sum);  //sum = 150
        System.out.println("Average: "+average);  //average = 30



        int[] arr2 = {1, 2, 3};  // 5/3=

        System.out.println(5/3);   // 1
        System.out.println(5/3);  // dec = 1.66666







    }
}
