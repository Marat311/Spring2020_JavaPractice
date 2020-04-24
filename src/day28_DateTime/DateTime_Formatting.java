package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime_Formatting {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2015, 12, 25, 11, 30, 45);

        System.out.println(dateTime1);

        //Tue 12/25/2015 11:30 am

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EE, MM/dd/yyyy hh:mm:ss a");

        System.out.println(dateTime1.format(dtf));




    }
}
