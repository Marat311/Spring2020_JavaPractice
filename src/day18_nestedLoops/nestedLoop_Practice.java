package day18_nestedLoops;

public class nestedLoop_Practice {

    public static void main(String[] args) {

        for(int j = 1; j<=5; j++) {

            for (int i =1; i <= 5;i++){ // 1,2,3,4,5
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("========================");
        /*
        *******
        *******
        *******
        *******
        *******
        *******
        *******
         */

        for(int i=0; i<7;i++) {


            int a = 1;
            while (a <= 10) {
                System.out.print("* ");

                a++;
            }
            System.out.println();
        }






    }
}
