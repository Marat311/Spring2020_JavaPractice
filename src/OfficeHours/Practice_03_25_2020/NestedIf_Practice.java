package OfficeHours.Practice_03_25_2020;

public class NestedIf_Practice {
    public static void main(String[] args) {

        byte weekDays = 5;
        boolean validNumber= weekDays>0 && weekDays<8;
        if (validNumber){
            if (weekDays==1){
                System.out.println("monday");
            }else if (weekDays==2){
                System.out.println("tuesday");
            }else if (weekDays==3){
                System.out.println("wednesday");
            }else if (weekDays==4){
                System.out.println("thursday");
            }else if (weekDays==5){
                System.out.println("friday");
            }else if (weekDays==6){
                System.out.println("suturday");
            }else {
                System.out.println("sunday");
            }

        }else{
            System.out.println("Invalid Entry");
        }




    }
}
