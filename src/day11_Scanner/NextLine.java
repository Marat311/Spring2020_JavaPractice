package day11_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the full name: ");
        String fullName = input.nextLine();  // exepts the "Enter"
        System.out.println(fullName);
        System.out.println("Enter the full name: "+fullName);
        System.out.println("Enter your sentense: ");
        String sentense = input.nextLine();
        System.out.println("You entered: "+sentense);


    }
}
