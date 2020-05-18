package day39_AccessModifier;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Test {
    public static void main(String[] args) {


        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.defaultAccess);
        System.out.println(obj.publicAccess);
     //   System.out.println(obj.SSN);  // private only accesseble only with the same class
    }
}
