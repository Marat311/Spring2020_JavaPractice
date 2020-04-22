package day26_MethodOverloading;

public class MethodOverloading3 {
    /*
first method can find the sum of the int numbers
second method: can find the sum of two double numbers
 */
    public static void main(String[] args) {
        sum (10,20);  // void method does not return any value
        sum (1.5, 3.5);
        double num1 = sum(10, 15.5);
        System.out.println(num1);

        //25l, 30l

        double num2 = sum(25l, 30l);
        System.out.println(num2);

        sum((int)25l, (int)30l);




    }


    public static void sum(int a, int b){
        System.out.println(a+b);
    }



    public static double sum(double a, double b){ // in method overloading, return type does not meter
        return a+b;
    }
}
