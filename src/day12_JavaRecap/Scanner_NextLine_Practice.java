package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //7921 JonesBranch Dr, Mclean VA, 22034
        // fullAddres: Building-number Street, city, stet zipcode
        System.out.println("Builder Number: ");
        String Bnumber = input.next();  //7921+Enter

        input.nextLine(); // used for taking out Enter from scanner

        System.out.println("Street: ");
        String street = input.nextLine();

        System.out.println("Enter the zip code: ");
        int zipcode = input.nextInt();  //22034Enter
        input.nextLine();  // take out the Enter

        System.out.println("enter the city name and state seperated by comma and space");
        String cityState = input.nextLine();
        String fullAdress= Bnumber+ " "+street+ ", "+cityState+" "+zipcode;
        System.out.println(fullAdress);






    }
}
