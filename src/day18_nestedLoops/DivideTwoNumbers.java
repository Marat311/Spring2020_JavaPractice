package day18_nestedLoops;

public class DivideTwoNumbers {
    /*
    write a program that can divide two numbers.
			NOTE: DO NOT USE division, multiplication, or module operators
			10/3==>3 with a reminder of 1
			a = a-b =7
			a = a-b = 4;
			a= a-b= 1;

			count = 3; a = 1;
     */
    public static void main(String[] args) {
        int a = 3;
        int b = 0;

        if(b==0){
            System.out.println("Divisor can not be zero");
            System.exit(0);
        }

        int count = 0; // count the execution of the loop

        while (a>=b){
            a-=b;
            count ++;
        }

        if(a==0) {
            System.out.println("The result is: " + count);
        }else {
            System.out.println("The result is: " + count + " with a reminder of " + a);
        }


    }

}
