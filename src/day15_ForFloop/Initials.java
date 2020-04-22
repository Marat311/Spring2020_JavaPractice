package day15_ForFloop;

import java.util.Scanner;

public class Initials {
    /* write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

         String initials1 = firstName.substring(0,1)+lastName.substring(0,1);
        initials1 = initials1.toUpperCase();

        String initials2 =""+ firstName.charAt(0)+ lastName.charAt(0);  // "" returns string
        initials2 = initials2.toUpperCase();

        System.out.println(initials1);
        System.out.println(initials2);









    }
}
