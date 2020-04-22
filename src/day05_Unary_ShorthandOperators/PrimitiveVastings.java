package day05_Unary_ShorthandOperators;

public class PrimitiveVastings {

    public static void main(String[] args) {

        // implict casting: done automatically
        int a = 10;
        long b = a; // implicit casting is done automaticly
        // b = 10L;
        //int c = b; b is stoll long dataType

        int a1 = 100;
        long b1 = (long) a1; // manually doing the implicit casting
        // int c1 = b1; long is larger

        // explicit casting

        int inum = 100;
        byte bnum = (byte) inum;
        System.out.println(bnum);

        short snum = (byte) inum;
        System.out.println(snum);

        double dnum = 5.5;
        float fnum = (int)dnum;
        // fnum = (int) 5.5;
        // fnum = 5;
        // fnum = 5.0;
        System.out.println(fnum);

        double d1 = 10.5;
         long l1 = (long) ((float) d1);
        System.out.println(l1);

        float f1 = 60.5f;
        int i1 = (short)f1;
        System.out.println(i1);

        long ln = 99999999999l;
        int in = (int) ln;

        System.out.println(in); // it gives different num because 999999999999 is out of int range


        char ch1 = 'a';
        short sh1 = (short)ch1;
        System.out.println(sh1); //97

        char ch2 = 23456;
        System.out.println(ch2);
        double db1= ch2;
        System.out.println(db1); //23456.0

        int z1 = 10;
        double tb1 = z1;  //10.0
        short y1 = (byte)z1;
        System.out.println(y1);




    }
}
