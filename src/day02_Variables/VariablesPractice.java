package day02_Variables;

public class VariablesPractice {

    public static void main(String[] args) {
        /*
        salary, federal tax, state tax, loan, ssn
        */
        int salary = 49700;
        double federaltax = 0.018;
        float statetax = 0.065f;

        // salary after tax = salary (1-sum of taxes)

        double sumtaxes = federaltax + statetax;
        double salaryaftertax = salary * (1-sumtaxes);
        System.out.println(salaryaftertax); //salary after tax

        System.out.println("============================");

        //area of the circle = r*r*pi
        double r= 5.5;
        double area = r *r *3.14;
        System.out.println(area);

int kg = 56;
double pound = kg * 2.25;
        System.out.println(pound);
        System.out.println("===================================");

        double lira = 1000;
        double lirainDollar = lira / 6.15;
        System.out.println(lirainDollar);

        double rupi = 1000000;
        double rupiInDollar = rupi* 0.014;
        System.out.println(rupiInDollar);
        System.out.println("===============================");

        double liter = 10000;
        double galons = liter / 3.7;
        System.out.println(galons);




    }

}
