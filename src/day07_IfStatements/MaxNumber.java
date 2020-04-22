package day07_IfStatements;
/*Warmup task:

	2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)

 */
public class MaxNumber {

    public static void main(String[] args) {

        double a = 100.5;
        double b = 200.5;
        double c = 300.5;

        boolean aGreater = a > b && a >c; // if a is greater than b and c, the a is maximum
        boolean bGreater = b > a && b > c; // if b greater then both a and c, then b is max
     //   boolean bGreater2 = b > a || b > c; // if b is greater than either a and c, then b is max

        boolean cGreater = c >a && c >b; // if c greater than a and b, then c is max
        if (aGreater) {
            System.out.println(a + " is greater number");
        }
        if (bGreater) {
            System.out.println(b + " is greater number");
        }
        if (cGreater) {
            System.out.println(c + " is greater number");
        }



    }
}
