package OfficeHours.Practice_05_13_2020;

import sun.jvm.hotspot.oops.Instance;

public class InstanceTest {
    public static void main(String[] args) {

        Instances obj1 = new Instances();
        obj1.name = "Muhtar";

        Instances obj2 = new Instances();
        obj2.name = "Kuzzat";

        System.out.println(obj1.name);  // Myhtar
        System.out.println(obj2.name);  //null

        obj1.printName();
        obj2.printName();

    }
}


    class InstanceBlock{
        public static void main(String[] args) {

            Instances obj = new Instances();
            System.out.println(obj.name);

        }

    }

