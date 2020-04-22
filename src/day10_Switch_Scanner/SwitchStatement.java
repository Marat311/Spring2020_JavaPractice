package day10_Switch_Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        byte a=4;
        float a1= 4.5f; //not excepted
        long a2= 10l;  //not excepted
        double a3= 2.5d;  //not excepted
        boolean a4= true;  //not excepted
        char a5= 'a';

        switch(a5){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Invalid case");
                break;

        }




    }
}
