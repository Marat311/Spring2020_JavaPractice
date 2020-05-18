package day37_Constructors;

public class InstanceBlock {

    static {
        System.out.println("static time");
    }


    {

        System.out.println("Instance block");
    }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();

        InstanceBlock obj2 = new InstanceBlock();
    }


}
