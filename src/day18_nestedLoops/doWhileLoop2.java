package day18_nestedLoops;

public class doWhileLoop2 {
    public static void main(String[] args) {

        int number = 103; // print the number between 100~ number
        while(number>=100){  // true
            System.out.println(number); //103, 102, 101, 100

            number--;
        }
        System.out.println("=======================");

        int number2= 103;

        do{
            System.out.println(number2); // 103 // 1 times
            number2--;
        }while(number2<100);  // false


    }
}
