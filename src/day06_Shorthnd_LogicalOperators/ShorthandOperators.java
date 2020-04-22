package day06_Shorthnd_LogicalOperators;

import com.sun.javaws.IconUtil;

public class ShorthandOperators {

    public static void main(String[] args) {

        int x =20;
        x += 10;  // x = x + 10 = 30

        System.out.println(x);  //30

        x+=60; // 90
        System.out.println(x);
        String schoolname = "Cybertek";
        schoolname += 12345;  // schoolname = scholname + 12345
        System.out.println(schoolname);
        System.out.println( 'a' + 'b');
        //                  97 + 98 ==> 195

        char ch1  = 'a'; //97
        ch1 += 'b';  //98

        System.out.println(ch1);  // character
        // char ch1 = 195;

        int num = 'z'; // 122
           num += 'x'; //120
        System.out.println(num);
        // num = 242

        int A = 100;
        A -=90;
        System.out.println(A);

        int B = 200;
        B -= A; // B = B - A ==> 190
        System.out.println(B);


        int a =2;
        a*= 3;
        System.out.println(a); //6

        int b = a *= 10;
        //b = a = a * 10
        System.out.println(b); //60
        System.out.println(a);  //60

        int a1 = 100;
        int b1 = (a1*= 2) + ++a1;
        // b1 = a1 = 100 * 200 + 201
        // b1 = 401
        System.out.println(b1);
        int x1 = 10;
        int y = x1 += 10*2;
        // y = x1 = 10 + 20
        System.out.println(y);
        //int b1 = a1*= 2 + ++a1;
        // b1 = 100*= 2 +101
        //b1 = 100* 103
        // b1 = 10300

        int q = 20;
        int p = q*=20*3;
        // p = 20* = 60 ==> 1200
        System.out.println(p);

        int num1 = 300;
        num1 /= 2;  //num1 = num1 / 2 ==> 150
        System.out.println(num1);

        int num2 = 400;
        num2 /=20+10; // num2 = 30; num2 = 400/30 ==> 13.333
        System.out.println(num2); //13 because int -whole num
        int num3 = 300;
        num3 %= 10+20; // 300% = 30 ==> num3 = 300%30 ==> num3 = 0
        System.out.println(num3);

        int n1 = 400;
        n1 %= 3*5;
        // 400% = 15
        // n1 = 400% 15 = 10
        // 400/15 = 26.666
        // reminder: 400- (15*26) = 10
        System.out.println(n1);







    }
}
