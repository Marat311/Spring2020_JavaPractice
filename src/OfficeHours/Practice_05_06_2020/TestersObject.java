package OfficeHours.Practice_05_06_2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import day24_Methods.Test;

public class TestersObject {
    public static void main(String[] args) {


        Tester tester1 = new Tester();
        tester1.name = "Muhtar";
        tester1.jobTitle = "SDET";
        tester1.salary = 900000;
        tester1.employeeId= 123456;

        Tester tester2 = new Tester();
        tester2.setInfo("Onur", "Junior SDET", 100000, 1234);

        System.out.println(tester2);
        System.out.println(tester1.toString());

        tester1.smokeTesting();
        tester2.smokeTesting();








    }
}
