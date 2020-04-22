package day05_Unary_ShorthandOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 10;  // positive 10
        int b = +a;  // positive 10

        System.out.println(a);
        System.out.println(b);

        int a2 = -10;
        boolean result = a2 > 0;
        boolean result2 = a2 < 0;
        System.out.println(result);
        System.out.println(result2);

        int x1 =-10;
        int y1 = -x1;
        // - (-10) ==> +10

        System.out.println(y1); //+10

        int x2 = +20;
        int y2 = - x2;
        // - (+20) ==> -20;

        System.out.println(y2); //-20

        int x3 = +20;
        int y3 = +x3;

        System.out.println(x3);  //+20

        int z = 100;
        System.out.println(++z);  // 101, increases it immediatly
        System.out.println(z);  // 101
        int p = 100;
        System.out.println(p++); // first passes the current velue
        System.out.println(p);  //increases the value by 1



    }
}
