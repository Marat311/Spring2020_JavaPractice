package day18_nestedLoops;

public class NestedLoop2 {
    public static void main(String[] args) {

        /*
              *
              * *
              * * *
              * * * *
              * * * * *
         */
        for(int a = 1; a<=9; a++) {
            for (int i = 1; i <= a; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("===================");

        for(int a = 9; a>=0; a--) {
            for (int i = 1; i <= a; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("======================");
/*
a
a b
a b c
a b c d
a b c d e
 */
        for(char z = 'a'; z <= 'z'; z++){

            for(char ch ='a'; ch <= z ; ch++ ){  //  'a' >= 'a'
                System.out.print(ch+" ");
            }
            System.out.println();


        }

        System.out.println("=======================================");

        for(char z = 'z'; z >= 'a'; z--){

            for(char ch ='a'; ch <= z ; ch++ ){  //  'a' >= 'a'
                System.out.print(ch+" ");
            }
            System.out.println();


        }

    }
}
