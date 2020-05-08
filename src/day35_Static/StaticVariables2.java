package day35_Static;

public class StaticVariables2 {

    int insVariable; // every single object of the class has own coppy

    static int staticVariable;  // there is only one copy of static shared by all objects

    public static void main(String[] args) {

        StaticVariables2 obj1 = new StaticVariables2();
        obj1.insVariable = 300;
        obj1.staticVariable = 400;

        StaticVariables2 obj2 = new StaticVariables2();

        System.out.println(obj1.insVariable);  // 300
        System.out.println(obj2.insVariable);  // 0
        System.out.println("=========");
        System.out.println(obj1.staticVariable); // 400
        System.out.println(obj2.staticVariable); // 400
        System.out.println("=========");
        System.out.println(StaticVariables2.staticVariable);  //400 // ONLY static can be called through the class name
      //  System.out.println(StaticVariables2.insVariable);  // instance CAN NOT be called through class name


    }
}
