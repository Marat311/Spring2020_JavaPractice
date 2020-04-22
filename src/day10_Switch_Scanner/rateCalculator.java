package day10_Switch_Scanner;
import java.util.Scanner;
public class rateCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        System.out.println("Entry your salary: ");
        int salary = scan.nextInt();
        System.out.println("How many hours do you work per week");
        byte weeklyHours = scan.nextByte();

        System.out.println("How many weeks do you work in a year?");
        byte numberOfWeeks = scan.nextByte();
        //hourly rate = (salary/numberOfWeeks) / weeklyHours
        int hourlyRate = (salary/numberOfWeeks)/weeklyHours;
        System.out.println("Your hourly rate is: $"+ hourlyRate);
        //52 weeks on the year




    }
}
