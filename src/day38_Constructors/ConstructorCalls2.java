package day38_Constructors;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("Default constructor");

    }

    public ConstructorCalls2(int a){
    this();  // "Default constructor"
        System.out.println("Constructor witn int argument");

    }

    public ConstructorCalls2(String str){
        // System.out.println("Hello");
        this(10); // should be always first line,
                    // constructor can be only one!

        System.out.println("Constructor with String argument");


    }

    public static void main(String[] args) {
        ConstructorCalls2 obj = new ConstructorCalls2("MArina");

    }

    public void method1(){

    }
    {

    }

}
