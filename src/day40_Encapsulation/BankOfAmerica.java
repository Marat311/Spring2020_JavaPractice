package day40_Encapsulation;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import day39_AccessModifier.Employee;

public class BankOfAmerica {
    public static void main(String[] args) {


        EmployeeInfo venya = new EmployeeInfo();
        venya.setAddress("Manhetten");
        venya.setSalary(200000.50);

        System.out.println(venya.getAddress());
        System.out.println(venya.companyName);
        System.out.println(venya.getSalary());




    }
}
