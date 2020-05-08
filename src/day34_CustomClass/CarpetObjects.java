package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {

    public static void main(String[] args) {

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};
        carpets[0].customOrder(7, 8.5, 20, true);
        carpets[1].customOrder(10, 15, 30, false);
        carpets[2].customOrder(10, 15, 30, true);
        carpets[3].customOrder(20,15,25,false);
        carpets[4].customOrder(9,20,15,true);

        System.out.println(carpets[0]);
        System.out.println("==============");
        System.out.println(carpets[1]);
        System.out.println("++++++++++++++");
        System.out.println(carpets[2]);
        System.out.println("==============");
        System.out.println(carpets[3]);
        System.out.println("++++++++++++++");
        System.out.println(carpets[4]);
        System.out.println("________________");

        ArrayList<Carpet> persianCarpet = new ArrayList<>();
        for(Carpet eachCarpet:carpets){
            if(eachCarpet.isPersian){
                persianCarpet.add(eachCarpet);
            }

        }
        System.out.println("There are "+persianCarpet.size()+" persian carpets");
        System.out.println(persianCarpet.get(0).calCost());
        System.out.println(persianCarpet.get(1).calCost());
        System.out.println(persianCarpet.get(2).calCost());

        ArrayList<Carpet> regularcarpet = new ArrayList<>(Arrays.asList(carpets));
        //regularcarpet.removeAll(persianCarpet);
        regularcarpet.removeIf(p->p.isPersian);
        System.out.println("There are "+regularcarpet.size()+" regular carpets");

        for(int i =0; i<regularcarpet.size(); i++) {
            System.out.println(regularcarpet.get(i).calCost());
        }



    }
}
