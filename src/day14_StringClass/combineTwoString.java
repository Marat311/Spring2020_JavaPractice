package day14_StringClass;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

/*
1. Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
 */
public class combineTwoString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first word");
        String words1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        String result = words1.concat(" "+word2).concat(" "+words1);
        System.out.println(result);




    }


}
