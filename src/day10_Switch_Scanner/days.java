package day10_Switch_Scanner;

public class days {
    /*
    2. write a program that can display the days based on the numbers 1 ~ 7
			MUST USE NESTED IF

     */
    public static void main(String[] args) {
        int num = 9;
        String result = "";
        if (num>0 && num<8); //num can only be 1~7

            result = (num ==1)? "Monday": (num ==2)? "Tuesday" :(num ==3)? "Wednesday":(num ==4)?"Thursday":
                    (num ==5)? "Friday":(num ==6)?"Saturday":(num ==7)?"Sunday":"Invalid";

        System.out.println(result);








    }

}
