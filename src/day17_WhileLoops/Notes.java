package day17_WhileLoops;

import java.util.Scanner;

public class Notes {
    /*
    Topics: While loop
		do-While loop

package name: day17_WhileLoops

Warmup tasks:
    1. write a program that can ask the user "enter a number" five times and return the maximum number
               hint: you will need for loop and if statement

    2. write a program that can ask the user "enter a number" five times and return the minimum number
                hint: you will need for loop and if statement

    3. write a program which prints out the numbers from 1 to 30:
            1. for numbers which are divisible by 3, print "FIN" instead of the number.
            2. for numbers which are divisible by 5, print "RA" instead of the number
            3. for numbers which are a divisible by both 3 and 5, print "FINRA" instead of the number

        Ex:
            1 2 FIN 4 RA FIND .... FINDRA
   4. write a program that can calculate the two numbers based on the user provided operators, the program will ask:
                1. enter first number
                2. enter the second number
                3. enter the math operators
                (assume that only the +, -, *, /, and % will be entered)
                then the system will give the result based on the operator
           at the end it will ask if the user want's to calculate another numbers, if user entered "NO" or "no",
           the program will stop execution, otherwise it repeats all the previous steps
                 (you will need a lop that has true condition without the iterator)

loop: repeating actions


While loop: repeated if statement

	if(Condition){
		statements;
	}

	while(Condition){
		statements;
	}

	ANY FOR LOOP CAN BE CONVERTED TO WHILE LOOP


BranchingStatements

System.exit(0): stops the entire program

break: exits the loop and switch statement

continue: skips the current iteration of the loop




practice task:
	1. write a program that can check if a string of text is palindrome



tomorrow : do-while loop & nested loop

Wednesday' office hours : loops review

Thursday & Friday: Arrays


     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        String r ="";
        System.out.println();
        if(word.endsWith("ey")){
            r="eys";
        }else if(word.endsWith("y")){
            r="ies";
        }else if(word.endsWith("ife")){
            r="ives";
        }else {
            r="s";
        }
        System.out.println(r);
    }
    }


