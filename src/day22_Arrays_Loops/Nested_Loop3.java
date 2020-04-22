package day22_Arrays_Loops;

public class Nested_Loop3 {
    public static void main(String[] args) {

        int[][] numbers={
                {1,2,3},                 // 0
                {4,5,6,7,8,9},           // 1
                {10,11,12,13,14},        // 2
                {15,16,17,18,19,20,21}   // 3
        };
        //1. print all even numbers in a same line
        // 2. count odd numbers ==> return the total odd numbers

        int countOdd = 0;
        for(int j=0; j<numbers.length; j++){  // j: index num of 1D arrays
            for(int i=0; i<numbers[j].length; i++){  // i: index number of elements in 1D array
                int num =numbers[j][i];
                if(num%2==0){
                    System.out.print(num+" ");  // even numbers: 2 4 6 8 10 12 14 16 18 20
                }else{
                    countOdd++;
                }
            }

        }
        System.out.println();
        System.out.println(countOdd); // count odd numbers = 11



    }
}
