package day11_Scanner;

import java.util.Scanner;

public class nextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();  // 30 + enter
        System.out.println("Your age is: "+age);
        input.nextLine();  // take out enter
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();
        System.out.println("Your full name: "+fullName);

    }
}
