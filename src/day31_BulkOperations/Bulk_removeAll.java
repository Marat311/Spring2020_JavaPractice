package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_removeAll {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,8,1,3));
//       remove 1,3,5,8

  /*      Integer a = 1;
        list.remove(a);
        list.remove(a);
        Integer b = 3;
        list.remove(b);
        list.remove(b);
         */
     //   list.removeAll(Arrays.asList(1,3));
        Integer[] arr = {3,1,5,8};
        list.removeAll(Arrays.asList(arr));
        System.out.println(list);
        System.out.println("+++++++++++++");

        String [] names = {"Mary", "Kelly", "Kot", "Slon", "Jack", "Mary", "Mary"};
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList);

        namesList.removeAll(Arrays.asList("Mary"));
        System.out.println(namesList);

    }
}
