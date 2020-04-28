package day29_Wrapper_ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValueOfMethods {
    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str);  // wrapper class Integer 123
        System.out.println(a);

        double b = Integer.valueOf(str);  // unboxing
        // double = Integer

        System.out.println(b);

        String str2 = "15.5";
        double d1 = Double.parseDouble(str2);
        //double  = double  // none of boxing

        double d2 = Double.valueOf(str2);
        //double = Double  // Unboxing
        System.out.println(d1);  // 15.5
        System.out.println(d2);  //15.5
        System.out.println(d1==d2);  //true
        System.out.println("=========================");

        int z1= 2000;
       // Long l1 = z1;  does not except eny other primitives except for long

        Short sh1 = 3000;
        int z2 = sh1;

        String n1 = "true";
        Boolean b1 = Boolean.valueOf(n1);
        // Boolean = Boolean  // none
        System.out.println(b1);

        String n2 = "FAlSe";
        boolean b2 = Boolean.valueOf(n2);
        // boolean = Boolean // unboxing
        System.out.println(b2);

        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum);

        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2);

        int minNum = Integer.MIN_VALUE;
        System.out.println(minNum);

        byte maxNum3 = Byte.MAX_VALUE;
        System.out.println(maxNum3);   // 127
        byte minNum3 = Byte.MIN_VALUE;
        System.out.println(minNum3);  // -128


        System.out.println("+++++++++++++++++++++");

        boolean[]arr = new boolean[3];
        System.out.println(Arrays.toString(arr));

        Integer[]arr2 = new Integer[3];
        System.out.println(Arrays.toString(arr2));







    }
}
