package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {
        // predicate can be applicate with any Collection type

       Predicate<Integer> oddNumber = a -> a % 2 != 0;

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddNumber);
        System.out.println(list);
        System.out.println("=============");

        Predicate<Integer> lessThen5 = x-> x<=5;
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(lessThen5);
        System.out.println(list2);
        System.out.println("+++++++++++++++++");

        Predicate<String>statsWithM = s -> s.toLowerCase().startsWith("m");
        ArrayList<String>names = new ArrayList<>();
        names.addAll(Arrays.asList("Marina", "Lena", "Sveta", "Katya", "Marry"));
        System.out.println(names);
        names.removeIf(statsWithM);
        System.out.println(names);
        System.out.println("2+++++++++++++++++");

        Predicate<String> startsWithMorA = each -> each.startsWith("M") || each.startsWith("A");

        ArrayList<String> nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Asya", "Alex", "Muhtar", "Rada", "Olya"));

        nameList.removeIf(startsWithMorA);
        System.out.println(nameList);
        System.out.println("======================");
                          //          c-> c >= 48 && c <=57;
        Predicate<Character> digits = c -> Character.isDigit(c);
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'B', '3', '4', '5', '@', '&', 'Z'));
        System.out.println(chars);
        chars.removeIf(digits);
        System.out.println(chars);
        System.out.println("+++++++++++++++++++");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
       // Predicate<Integer> greaterThen5 = p-> p>5;
        nums.removeIf(p -> p>5);
        System.out.println(nums);






    }
}
