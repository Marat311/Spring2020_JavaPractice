package OfficeHours.Practice_04_08_2020;

public class DoWhileLoop {
    /*
    do{
        statements;

        }while(conditions);
        execution order:
        1. statements
        2. condition
             if true: repeats step1
             if false: stops the loop

     */
    public static void main(String[] args) {

        boolean b = false;

        while(b){  //while:  if conditon false, never gets executed
            System.out.println("Hello World");
        }
        System.out.println("=======================");

        do{ //do-while: if condition-false, only 1 executed anyway!
            System.out.println("Hello Cybertek");
        }while(b);

        System.out.println("======================");
        int j=0;
        do{
            if(j%15==0) {
           System.out.print(j + " ");
           }
             j++;
        }while(j<=100);


    }
}
