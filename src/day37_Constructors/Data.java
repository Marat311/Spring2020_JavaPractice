package day37_Constructors;

public class Data{

    static int staticVariable = 300;
    int instanceVariable = 400;

    public static void staticMethod(){
        System.out.println("static method");
    }

    public void instanceMethod(){
        System.out.println("instance method");
    }

    public static void main(String[] args) {
        staticVariable = 500;
        System.out.println(staticVariable);
    }
}
