package day25_MethodsRecap;

public class return_Statement {

    public static void main(String[] args) {
/*
        if(10>9){

            return;  // exits the current method only
        }
        System.out.println("Hello");
*/

        method1();  //return statement
        method2();  // system.exit

        System.out.println("Hello");
        System.out.println("Hi");

    }
public static void method1(){

         if (10>9){
          return;
         }
    System.out.println("Hi Marina");  // not printed after return
    }


    public static void method2(){
        if (10>9){
            System.exit(0);
        }
        System.out.println("Hello Cybertek");
    }

}
