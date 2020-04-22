package day20_ArraysContinue;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {


        String name = "Marina Velitskaia";
        char []ch = name.toCharArray();
        System.out.println(Arrays.toString(ch));

        String str1 = "Cybertek School";
        String str2 = "School Cybertek";
        char[] ch1 = str1.toCharArray();  // [C, y, b, e, r, t, e, k, , S, c, h, o, o, l]
        char [] ch2= str2.toCharArray();  // [S, c, h, o, o, l, ,C, y, b, e, r, t, e, k ]
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean equalStr = Arrays.equals(ch1, ch2);
        System.out.println(equalStr);  // str1 and str2 are build out of same characters




    }



}
