package day36_StaticBlock;

import day34_CustomClass.Tester;

public class StaticBlock4 {

    static String name= "Cybertek school";
    static Tester t1 = new Tester();
    // t1.setTesterInfo("marina", "qa", 123000, 123);  //compiler error

    int insVariable;

  static{
        // gets executed as soon as the class is loaded
        // designed to initialize static variables

        name = "Cybertek School";
      t1.setTesterInfo("marina", 123, "QA", 123000);
      t1.setTesterInfo("Venya", 456, "QA", 50000);

    //  StaticBlock4 obj1= new StaticBlock4();
    //  obj1.insVariable = 300;  // do not use static block for initializing instance variables


  }


    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(t1);

        StaticBlock4 obj2 = new StaticBlock4();
        System.out.println(obj2.insVariable);
    }
}
