package day13_StringClass;

import java.util.Scanner;

public class StringManipulations_Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullname = input.nextLine(); // cybertek school

        String firstname = fullname.substring(0,fullname.indexOf(" "));
        String lastname = fullname.substring(fullname.indexOf(" ")+1);

        firstname = firstname.substring(0,1).toUpperCase()+firstname.substring(1).toLowerCase();
        //          firstname 0~1==>M, + aRIna ==> arina
        lastname = lastname.substring(0,1).toUpperCase()+lastname.substring(1).toLowerCase();


        System.out.println("Your first name is: "+firstname);
        System.out.println("Your last name is: "+lastname);
        /*
         Assignment:
            write me a programk that asks the user fiurt and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */


    }
}
