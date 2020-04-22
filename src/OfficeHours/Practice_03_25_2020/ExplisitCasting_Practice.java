package OfficeHours.Practice_03_25_2020;

public class ExplisitCasting_Practice {
    public static void main(String[] args) {

        byte bnum= 100;
        short snum = (short) bnum; // implicit casting

        int inum = 200;
        short sNum= (short)inum; // explicit casting
        float gnum= (float)0.5;
        System.out.println(gnum);  //0.5
        float fnum2 = (long)0.5;
        System.out.println(fnum2);  //0.0
        long lnum = (long)4.5;
        System.out.println(9/2);
        System.out.println(9/(float)2);
        System.out.println(10.0/3);


    }
}
