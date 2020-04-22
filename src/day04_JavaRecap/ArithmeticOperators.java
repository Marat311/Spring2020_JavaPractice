package day04_JavaRecap;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 10 / 3; // 3
        // 10/ 3 ==> 3.3333
        System.out.println( a );

        System.out.println(10 / 4); // 2
        // 10 / 4 ==> 2.5

        double d = 10/4;
        //   double d = 2;
        // d ==> 2.0;

        System.out.println(d); //2.0
        System.out.println( 10.0 / 4); // 2.5


        boolean evennumber = 25 % 2 == 0; // even number
        // if 20 / 2 has remainder of 0, then it's even number
        // 1 == 0 ==> false
        System.out.println(evennumber); // false
        System.out.println(25 % 2);

        boolean oddNumber = 22 % 2 != 0; //odd number
        //                 0 != 0 ==> false

        System.out.println(oddNumber);

        System.out.println(10 % 2 == 0); // 10 is even number
        System.out.println(11 % 2 != 0); // 11 is odd number

        System.out.println("10 is even number:" + (10 % 2 == 0));
        System.out.println("11 is even number:" + (11 % 2 == 0));

        System.out.println( "25 is even number:" + !(15 % 2 != 0));
        System.out.println( "25 is even number:" + (15 % 2 == 0));

        








    }
}
