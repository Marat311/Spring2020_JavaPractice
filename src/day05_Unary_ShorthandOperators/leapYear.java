package day05_Unary_ShorthandOperators;

public class leapYear {

    public static void main(String[] args) {

        short year = 2025;
        //leapYear: year % 4 == 0
        //    if returns true ==> leapYear, if it returns false ==> not leapYear

        boolean leapYear = year % 4 == 0; // if the year can be devided by 4 without eny reminder, then it's leap year

        System.out.println(year + " is leap year: " + leapYear);

        String result = year + " is leap year: " + leapYear;
        System.out.println(result);



    }

}
