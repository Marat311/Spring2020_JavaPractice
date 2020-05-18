package OfficeHours.Practice_05_13_2020;

import sun.jvm.hotspot.oops.Instance;

public class Instances {

    String name;
    {
        name = "Zuura";
    }

    public static void main(String[] args) {
        Instances obj = new Instances();
        obj.name = "Zuura";
        System.out.println(obj.name);
    }

    public void printName(){
        System.out.println("Name is : "+name);
    }
}
