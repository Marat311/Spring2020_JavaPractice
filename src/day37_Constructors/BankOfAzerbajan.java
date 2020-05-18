package day37_Constructors;

import java.util.ArrayList;

public class BankOfAzerbajan {
    public static void main(String[] args) {
        ArrayList<employee> list = new ArrayList<>();
        list.add(HumanResources.employee3);
        list.add(HumanResources.employee5);

        System.out.println(list.get(0));



    }
}
