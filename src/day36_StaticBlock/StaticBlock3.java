package day36_StaticBlock;

public class StaticBlock3 {

    static String name;
    static int num;

    public static void main(String[] args) {
        name = "Marina";
        num = 200;

        System.out.println(name);
        System.out.println(num);
    }

    static {
        name="Marina";
        num = 200;
    }
}
