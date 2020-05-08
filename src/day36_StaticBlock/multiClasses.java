package day36_StaticBlock;

class Tester{
    public static void main(String[] args) {
        System.out.println("tester class");
    }

}

class Developer{ // AM default
    public static void main(String[] args) {
        System.out.println("dev class");
    }

}

class ScrumTeam{  // Access modifire: default
    public static void main(String[] args) {
        System.out.println("scrum team class");
    }

}

public class multiClasses { // AM: public
    public static void main(String[] args) {
        System.out.println("public class");
    }


}
