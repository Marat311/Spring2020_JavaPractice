package day44_Exceptions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class try_chatchBlock {
    public static void main(String[] args) {

        System.out.println("Test started");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(list.get(10));

        System.out.println("Test completed");
    }
}
