package OfficeHours.Practice_03_11_2020;

public class Practice_Variables {
    /*
       brand
       year
       price
       model
       miles
        */
    public static void main(String[] args) {
        String brand = "BMW" ;
        short year = 2020;
        float price = 50000.50f;
        String model = "X6";
        short maxMiles = 32767;

        System.out.println(brand);
        System.out.println("brand");
       // variables that are decleared in a block, must be intialized before use

        System.out.println("The vehicle " + year+" "+ brand+" " + model + ", has "+ maxMiles + " miles, price is "+ price + " dollars");

        System.out.println(9 + 10); //19, addition: both left and right side of the + values are numbers
        System.out.println("9"+ "10"); //910
        System.out.println("9" + 10); //910
        /*
        when we apply + to the text, it concates it
        when we apply + to numbers ==>  addition
        text + text ==> concatenation
        text +  number ==> concatenation
        number + text ==> concatenation
        number + number ==> eddition
         */




    }


}
