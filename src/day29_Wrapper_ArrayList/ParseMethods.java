package day29_Wrapper_ArrayList;

public class ParseMethods {
    public static void main(String[] args) {

        String str = "123";

        int a1 = Integer.parseInt(str);  //123

        System.out.println(str+1);  // 123- text

        System.out.println(a1+1);   // 123 number


        byte b1 = Byte.parseByte(str);  //Byte=123

        System.out.println(b1+5);

        Integer I1 = (int) Byte.parseByte(str);  // AutoBoxing
        // Integer = (int)byte;
        // Integer = int;

        String str2 = "10.5";

        float v1 =Float.parseFloat(str2); //float 10.5

        System.out.println(v1);

        double d = Double.parseDouble(str2);  // double 10.5

        System.out.println(d+1);

        String str3 = "3147483647";

        long l = Long.parseLong(str3);
        System.out.println(l+2);    //nothing

        Long num2 = Long.parseLong(str3);

        System.out.println(num2);   //autoboxing

         String result = "Today is monday";  // not "true" or "false" ==> false
         boolean r1 = Boolean.parseBoolean(result);  // boolean, false

        System.out.println(r1);  // false

        String result2 = "tRUe";  // not "true" or "false" ==> false
        boolean r2 = Boolean.parseBoolean(result2);  // boolean, NOT case sensitive

        System.out.println(r2);  // true

        String result3 = "FaLSe";  // not "true" or "false" ==> false
        boolean r3 = Boolean.parseBoolean(result3);  // boolean, NOT case sensitive

        System.out.println(r3);  // false


    }
}
