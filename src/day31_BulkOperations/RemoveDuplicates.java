package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,6,7,7));
        ArrayList<Integer> result = new ArrayList<>();
                     //expected result: [1,2,3]
        for(Integer each:list){
            if(!result.contains(each)){
                result.add(each);
            }
        }
        System.out.println(result);
        /*
        write a program that can remove duplicates from an array of integer
        do not use for each
         */
        Integer[] arr1 = {1,1,2,2,3,3};
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 0; i< arr1.length; i++){
            if(!list2.contains(arr1[i])){
                list2.add(arr1[i]);
            }
        }
        System.out.println(list2);



    }
}
