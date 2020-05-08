package OfficeHoursSaim;

public class ExtraEndClass {

    public static void main(String[] args) {

        System.out.println(extraEnd("hello"));
        System.out.println(extraEnd("hi"));

    }

    public static String extraEnd(String str) {
        String w = str.substring(str.length()-2);
        return w+w+w;
    }

}
