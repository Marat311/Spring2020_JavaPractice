package day24_Methods;

import javax.naming.PartialResultException;
import java.util.Arrays;

/*
AccessModifier Specifier return-Type methodName(parameter){
}
4. create a function that can print the maximum number from any given array
5. create a function that can print the minimum number from any given array
6. create a function that print out the array in descending order
[1,2,3]==>[3,2,1]
 */
public class TassFromYesterday {

    public static void MaxNumber(int[]array){
        Arrays.sort(array);  // ascending order
        System.out.println("MaxNumber: "+array[array.length-1]);

    }


    public static void MinNumber(int []array){
        Arrays.sort(array);  // ascending order
        System.out.println("Minimum number: "+array[0]);
    }

    public static void Descending(int[]array){
        Arrays.sort(array);

        for(int i =array.length-1; i>=0; i--){   //100,200,-100
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {10,8,9,5,4,3,2,1};
      //  MaxNumber(10);  //10, if parameter is array, the argument MUST be array
        MaxNumber(arr);

        MinNumber(arr);

        int []arr2 = {100,20,30,40,40,-100};
        MaxNumber(arr2);
        MinNumber(arr2);

        Descending(arr2);

    }


}
