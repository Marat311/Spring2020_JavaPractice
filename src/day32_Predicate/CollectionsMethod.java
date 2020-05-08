package day32_Predicate;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        int max = Collections.max(list);
        System.out.println(max);
        int min = Collections.min(list);
        System.out.println(min);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,1,2,3,4,4));
          //second max: 3
        //second min: 2
        Integer maxNum = Collections.max(numbers);  // 4
        numbers.removeAll(Arrays.asList(maxNum));
        System.out.println(numbers);

        int secondMax = Collections.max(numbers);

        System.out.println(secondMax);
        System.out.println("1++++++++++++++++");
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));
        Integer minNum = Collections.min(list2);  // 1

        list2.removeAll(Arrays.asList(minNum)); // removes all the min numbers
        System.out.println(list2);

        int secondMin = Collections.min(list2);
        System.out.println(secondMin);
        System.out.println("2========================");

        ArrayList<Integer> list3 = new ArrayList<>();
                    list3.addAll(Arrays.asList(1,2,3,4,5));  //{1,2,3,4,5}
                                      //       0 1 2 3 4
        System.out.println(list3);
        Collections.swap(list3, 0, 4); // {5,2,3,4,1}
        System.out.println(list3);
        System.out.println("3+++++++++++");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna","Anna","Anna", "Mary", "Jack", "Anna"));
      /*  names.set(0,"Irina");
        names.set(1, "Irina");
        names.set(5, "Irina");

       */
        Collections.replaceAll(names, "Anna", "Irina");
        System.out.println(names);













    }
}
