package day40_Encapsulation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Test {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
        //System.out.println(obj.SSN);

        System.out.println(obj.getSSN());

        // obj.SSN = 123456;
        obj.setSSN(123456);
        //System.out.println(obj.SSN);

        System.out.println(obj.getSSN());
    }
}
