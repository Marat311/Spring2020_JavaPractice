package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        // add 30,20,40,50,45,35,200

      /*  list1.add(30);
        list1.add(20);
        list1.add(40);
        list1.add(50);
        list1.add(45);
        list1.add(35);
        list1.add(3200);
*/
  Integer[] arr1 = {30,20,40,50,45,35,200};
  list1.addAll(Arrays.asList(arr1));
        System.out.println(list1);

        System.out.println("+++++++++++++++++++++");
        String [] names = {"Mary", "Muhtar", "Max", "Sada", "Ruslan" };
     //                     0         1        2       3        4
      //  names[5] = "Kolya";
        System.out.println(Arrays.toString(names));

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList(names));
          //            collection type
        nameList.add("Kolya");
        nameList.remove("Muhtar");
        System.out.println(nameList);

        System.out.println("=================");

        Integer[] num = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(num));


        System.out.println(numList);


    }
}
