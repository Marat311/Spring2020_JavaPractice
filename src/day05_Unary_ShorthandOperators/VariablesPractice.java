package day05_Unary_ShorthandOperators;
public class VariablesPractice {

    public static void main(String[] args) {

        //whole num: byte, short, int, long
        // decimal: float, double

        int a1 = 100;
        float f1 = (long)a1;
        //f1 = 100l;
        //f1 = 100.0;

        System.out.println(a1);

        long l1= (short)f1;
        // l1 = 100
        System.out.println(l1);

        String name;


        // System.out.println(name); // local variables cannot be used without initializing
      //  name = "Cybertek"; //in Java: first come first serve



    }
}
