package OfficeHours.Practice_03_25_2020;

public class multiBranchIf_Practice {
    public static void main(String[] args) {

        int number = 0;
        if (number >0){
            System.out.println("It's positive number");
        }else if (number<0){
            System.out.println("it's negative number");
        }else{
            System.out.println("It is zero");
        }

        int num1 = 100;
        int num2 = 200;

        if (num1>num2){
            System.out.println(num1 + " Is greater than "+num2);
        }else if (num2>num1){
            System.out.println(num2+" is greater than "+num1);
        }else{
            System.out.println(num1 +" are equal "+num2);
        }
        System.out.println("===============================");

        String browserName ="Chrome";
        if(browserName=="FireFox"){
            System.out.println("FireFox browser is opening");
        }else if (browserName=="Chrome"){
            System.out.println("Chrome browser is opening");
        }else if (browserName=="Internet Explorer"){
            System.out.println("Internet Explorer is opening");
        }else if(browserName=="Safari"){
            System.out.println("Safari browser is opened");
        }else if (browserName=="Opera"){
            System.out.println("Opera browser is opened");
        }else{
            System.out.println("Invalid browser name");
        }




    }
}
