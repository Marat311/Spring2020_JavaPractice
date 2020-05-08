package day02_Variables;

public class Notes {
    /*
    Topics: Comments
		Print vs println
		Escape Sequences
		Java CommandLine
		Variables



	single-line comment:	starts with //
				// comment1


	multi-line comment:  starts with /* and ends with */
				/*
				comment1
				comment2
				comment3
				*/
/*

    print statement: printing to the console

		System.out.println(): printing takes place from new line. breaks the line


		System.out.print(): does not break the line, printing takes place from where its left off



    escape sequences: must be given within ""
            \t: paragraph space
	 \n: new line
	 \": prints double quote " on the console
	 \\: prints \ on the console
	 \': prints single quote
             ' : prints single quote



    Java Command Line:
    javac (compiler): javac fileName.java
    java (JVM) : java className


    Variables: makes the data reusable
    decleare variables:
    DataType  variableName = Data;

    variabale name rules:
            1. Must be started with letters
				2. MUST be Unique
				3. cannot be Java Reserved words
				4. cannot contain special character other $ and _


    primitive data types: byte, short, int, long, float, double, char, boolean

	for numbers: byte, short, int, long, float, double


    whole number: byte, short, int, long

    decimal number: float, double

    range:
    double > float > long > int > short > byte

    larger one cannot be asisgned to smaller one
    smaller one can be assigned to larger one



    int: prefered primitive by the compiler for whole numbers
    everytime if a number is entered, compiler takes it as an int


    double: pefrered by the compiler of the decmial numbers

    float:
    float f1 = 0.5f;


    String: char sequences, string of texts

    String name = "Cybertek School";


+ with string: concates

      */
    public static void main(String[] args) {
        System.out.println("marina\tmarina\nmarina\"marina\\mar\'marin'");
    }
}
