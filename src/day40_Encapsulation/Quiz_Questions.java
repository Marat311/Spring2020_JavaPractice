package day40_Encapsulation;

public class Quiz_Questions {
    public static String name = "Osman";

    public Quiz_Questions(){ // constructor
        name = "Hilal";
    }

    { // instance block
        name = "Marionela";
    }

    static{
        name = "Madina";
    }

    public static void main(String[] args) {
        // System.out.println(name); // Madina

        // Quiz_Question12 obj  = new Quiz_Question12();
        //name = madina
        //  name = "Marionela";
        //  name = "Hilal";

        System.out.println(name);

    }

}
