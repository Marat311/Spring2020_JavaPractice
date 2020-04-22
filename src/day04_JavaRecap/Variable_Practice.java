package day04_JavaRecap;

public class Variable_Practice {
    public static void main(String[] args) {

        // DataType variableName =  Data;

        byte num1 = 127;
        short num2 = num1;  // larger then byte. double>float>long>int>short>byte
       // byte num3 = num2;
        int num4 = num2;  // int prefered by compiler
        long num5 = 9999999999l;
        float num6 = 100l;
        System.out.println(num6);  // 100.0 because float decimal
        float num7 = 0.5f;
        System.out.println(num7); //0.5
        double num8 = 0.5f;
        double num9 = 999999999l;
        double num10 = 100.5;
        System.out.println(num10); //100.5

        char ch1 = '$';
        System.out.println(ch1); //$

        char ch2 = 100; // 0-65565 range char
        System.out.println(ch2); //d, because every single character has a corresponding number

        int a1 = '8'; //it is char because '' and it is character
        System.out.println(a1); //56

        int a2 = 'z';
        System.out.println(a2); //122

        double d1 = 'z' + '8';

        System.out.println(d1); // 178.0
        char ch3 = 178;
        System.out.println(ch3);

        char ch4 = 'z' + '8';
        System.out.println(ch4);

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println( 9>10);  //false
        System.out.println( 9>=9);  //true
        System.out.println(9!=10);  // true
        System.out.println('a' == 'b'); //false
        System.out.println('a' == 'b'-1); // true
        //                 97 == 98 -1
        //                  97 == 97 ==> true

     //   System.out.println('a' == "a");  // does not match

        System.out.println("Muhtar" == "Good Guy");  // false
        //                  Muhtar == Good Guy ==> false

        System.out.println("Muhtar" != "Good Guy"); //true
        System.out.println("Muhtar" == "muhtar");  //false

       // System.out.println("Cybertek" == 10000);
        boolean r1 = !true; // false
        System.out.println(r1);  //false
        System.out.println(!r1);  //true






    }
}
