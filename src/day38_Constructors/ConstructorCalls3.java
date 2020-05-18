package day38_Constructors;

public class ConstructorCalls3 {

    public ConstructorCalls3(){
        this(9);
        System.out.println("default");
    }

    public ConstructorCalls3(int a){
      //  this();
        System.out.println("Int argument");
    }

    public ConstructorCalls3(String str){
        // this("Hello");
    }

    public static void main(String[] args) {
        new ConstructorCalls3();
    }

    public void method1(){
        // this();
    }
}
