package day18_nestedLoops;

import java.util.Scanner;

public class nestedLoop_Practise {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));
            System.out.println("Do you want to continue");
            String answer = input.next();
            while(  ! (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("no"))  ){
                System.out.println("Invalid Entry, please re-enter yes or no");
                answer = input.next();
            }


            if(answer.equalsIgnoreCase("No")){
                System.out.println("Thank you for using the calculator");
                break;
            }


        }

        /*
        write a program for the room reservation:
        king bad = 120$
        queen bad = 100$
        single bad = 80$
        should ask witch bedroom do you wanna reserve
        if user provider entry => please re-enter
        calculate the total price
        do you want to reserve another room:
        if yes - repeat the previous steps
        if no - your total price is: $$$
        if answer either yes or no ==> please re-enter
         */






    }




}
