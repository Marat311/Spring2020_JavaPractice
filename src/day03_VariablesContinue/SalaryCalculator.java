package day03_VariablesContinue;

import javax.imageio.stream.ImageInputStream;

public class SalaryCalculator {


    public static void main(String[] args) {

//DataType variableName= Data;

        double hourlyRate = 65;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 45;
        byte totalWeeks = 48;

        // salary = hourlyRate * weeklyHours * 52
        //52- weeks in year

      double salary = hourlyRate * weeklyHours * totalWeeks; // total salary before the text

        //sateTax = salary * stateTax
        double stateTax = salary * stateTaxRate;

        //federalTax = salary * federalTaxRate
         double federalTax = salary * federalTaxRate;

        //salaryAfterTax = salary - stateTax - federalTax;
        double salaryAfterTax = salary - stateTax - federalTax;
        // totalTax = stateTax + federalTax
        double totalTax = stateTax + federalTax;

        System.out.println("Your Salary is: $" + salary );
        System.out.println("StateTax is: $" + stateTax);
        System.out.println("Federal Tax is: $ " + federalTax);
        System.out.println("TotalTax is : $ " + totalTax );
        System.out.println("Salary after Tax is : $" + salaryAfterTax);


        /*
        System.out.println("Your salary is:" + salary );  // concatenation

        System.out.println("9" +3); //93, concatenation
        System.out.println(9 + "3");  //93 concatenation
        System.out.println( 9 + 3);   // 93, concatenation
        System.out.println( 9 + 3);   //12, addition

*/



    }
}
