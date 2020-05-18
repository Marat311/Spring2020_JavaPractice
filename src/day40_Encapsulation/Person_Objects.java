package day40_Encapsulation;

public class Person_Objects {
    public static void main(String[] args) {

        Person obj = new Person("Marina");
        System.out.println(obj.name);
       // System.out.println(obj.SSN);
        obj.setSSN(123);
        System.out.println("Marina SSN "+obj.getSSN());
       obj.setID(456);
        System.out.println( obj.getID());

    }
}
