package OfficeHours.Practice_03_25_2020;

public class nestedIf_Practice2 {
    public static void main(String[] args) {

        /*for th loan:
        if has a job that pays>50000 ==>might be eligible
        if he/she has good credit
        if his job history is more than equal to 2==> then eligible
         */
        int salary = 450000;
        short creditscore = 750;
        byte jobHistory = 5;  //year

        if (salary> 50000) {  // might be eligible
            if (creditscore> 650){ //Might be eligible
                if (jobHistory>=2) {
                    System.out.println("You are qualified");
                }else{
                    System.out.println("you dont have enought job history, come back later");
                }
            }else{  //Not be eligible due credit score
                System.out.println("You do not have good credit score");
            }


        }else{
            System.out.println("You need have a job that pays $50000");
        }


    }
}
