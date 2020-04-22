package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class Nested_Loop2 {
    public static void main(String[] args) {

        int [][] numbers = {
                {5,4,3,2,1},
                {10,11,12,13,14,15},
                {16,17,18,19,20}
        };
        // print all the odd numbers with reg for loop. MUST use continue statement

        for(int i = 0; i<numbers.length; i++){  // i index num of 1D arrays
            for(int j = 0; j<numbers[i].length; j++){// j: index num of elements

                if(numbers[i][j]%2==0){
                    continue;
                }
                System.out.println(numbers[i][j]);
            }
        }
        System.out.println("===========================");
// print all the even numbers with for each loop

        for(int [] each1DArray : numbers) {

            for (int eachElement : each1DArray) {

                if(eachElement%2!=0){
                    continue;
                }

                System.out.println(eachElement);
            }
        }










    }
}
