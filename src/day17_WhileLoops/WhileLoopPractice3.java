package day17_WhileLoops;

public class WhileLoopPractice3 {

    public static void main(String[] args) {
        /*
        for (int i = 0; i <100; i++){
            System.out.print("*");
        }

        */
        int i = 1;
        while(i<101){
            System.out.print("*");
            i++;
        }
        System.out.println();

        int number = 3;
        /*
        ***
        * *
        * *
        ***
         */
        System.out.println("*******");
        while(number>0){
            System.out.println("*     *");
            number--;
        }
        System.out.println("*******");

    }

}
