package day13_StringClass;

import java.util.Scanner;

/* 2. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */
public class ShippingInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Enter2

        System.out.println("Enter your building number");
        String buildNum = input.next();  // 112A Enter1

        input.nextLine();  // Enter3

        System.out.println("Enter your street address");
         String streetAdrees = input.nextLine();

         System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state: ");
        String stateName = input.nextLine();

        System.out.println("Enter your zip code:");
        String zipcode = input.nextLine();

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        String result = "Ship to: "+fullName+"\n\t\t"+buildNum+" "+streetAdrees+"\n\t\t"+cityName+", " +stateName+" "+zipcode;
        System.out.println(result);











    }
}
