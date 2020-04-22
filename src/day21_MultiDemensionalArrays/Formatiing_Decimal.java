package day21_MultiDemensionalArrays;

import java.text.DecimalFormat;

public class Formatiing_Decimal {
    public static void main(String[] args) {
        DecimalFormat DF = new DecimalFormat("0.00");  // rounding the decimals

        double a = 10.0/3.0;
        System.out.println(a);  // 3.3333333..
        System.out.println(DF.format(a));   // 3.33

        System.out.println(2.3456789);

        System.out.println(DF.format(2.3456789));




    }
}
