package day17_WhileLoops;

import java.util.Scanner;

public class whileLoopPractice {
    public static void main(String[] args) {
        /*
        ask the user yes or no,
        if th euser enters other than yes or no, repeat the previous step
         */

        Scanner input= new Scanner(System.in);

        System.out.println("Enter Yes or No");
        String word = input.next();
        boolean valid = word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("No");

        while (!valid){
            System.out.println("please re-enter");
            word = input.next();
            if (word.equalsIgnoreCase("yes") || word.equalsIgnoreCase("No")){
                break;
            }
        }

        if (word.equalsIgnoreCase("Yes")){
            System.out.println("Entered: Yes");
        }
        if (word.equalsIgnoreCase("No")){
            System.out.println("Entered: No");
        }





    }
}
