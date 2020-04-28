package day30_ArrayList;

import java.util.ArrayList;

public class CombineTwoArrays {

    public static void main(String[] args) {

        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>(); // {"A", "B", "C", "D", "E", "F", "G"}

        for(int i = 0; i <=arr1.length-1; i++){
            String eachElement = arr1 [i];
            list.add(eachElement);
        }

      /*  for(int i = 0; i <=arr2.length-1; i++){
            String eachElement2 = arr2 [i];
            list.add(eachElement2);
        }
        */

        for(String eachElement: arr2){
            list.add(eachElement);
        }



        System.out.println(list);




    }
}
