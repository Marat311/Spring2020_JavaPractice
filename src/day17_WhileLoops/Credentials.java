package day17_WhileLoops;

import java.util.Scanner;

public class Credentials {
    /*
    user: cybertek
    pass: cybertek123
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String username = input.next();
        System.out.println("Enter Pass word");
        String password = input.next();

        boolean valid = (username.equals("cybertek") && password.equals("cybertek123"));  // false
        // validating the first username and password

        int count = 1;

        while(!valid){  // false
            System.out.println("Please re-enter your credentions");
            System.out.println("Enter User name");
            username = input.next();
            System.out.println("Enter Pass word");
            password = input.next();

            valid = (username.equals("cybertek") && password.equals("cybertek123"));  // true
            // validating new username and password

            count++;
            if(count==3 && !valid){  //already have three Attemps and credentials are still incorrect
                System.out.println("Your account is locked");
                break;

            }

        }
        if (valid){
            System.out.println("Logged in");
        }



        /*
        int a = 10;

        a =20;
        System.out.println(a); // first a= 10; then reasighn and a= 20

*/

    }


}
