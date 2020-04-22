package OfficeHours.Practice_04_01_2020;

public class Literal_new {
    public static void main(String[] args) {

        String s1 = "Java"; // String literal
        String s2 = "Java"; // String literal

        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s1 == s2);  // true
        System.out.println(s1 == s3);  // false, two dif objects at different memory
        System.out.println(s3 == s4);  // false, new dif objects



    }
}
