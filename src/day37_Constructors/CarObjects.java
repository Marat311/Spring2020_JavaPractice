package day37_Constructors;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Honda", "CRV", 2019, 26000);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        System.out.println(car1);


        Car car2 = new Car("Mersedes", "GLK", 2018, 45000);
        System.out.println(car2);



    }
}
