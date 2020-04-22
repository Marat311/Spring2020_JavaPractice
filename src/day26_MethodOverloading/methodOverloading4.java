package day26_MethodOverloading;

public class methodOverloading4 {
    public static void main(String[] args) {  // only original method can be overloaded
        System.out.println("String");
    }

    public static void main(double[] args) {
        System.out.println("Double");
    }

    public static void main(int[] args) {
        System.out.println("Int");;
    }
}
