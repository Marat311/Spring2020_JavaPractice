package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CatsObjects {
    public static void main(String[] args) {

        Cats cat1 = new Cats();
        cat1.setCatInfo("Scotishfold", "blue", 9, "Melisa");

        System.out.println(cat1);
        Cats cat2 = new Cats();
        cat2.setCatInfo("British", "beige", 7, "Bobo");

        Cats cat3 = new Cats();
        cat3.setCatInfo("Calico", "brown-white", 6, "Cinnamon");


        ArrayList<Cats> catList = new ArrayList<>();
        catList.addAll(Arrays.asList(cat1, cat2, cat3));

        for(int i = 0; i<catList.size(); i++){
            System.out.println(catList.get(i));
        }
        System.out.println("+++++++++++++++++++++++++++");

        cat1.sleep();
        cat2.sleep();
        cat3.sleep();
        System.out.println("+++++++++++++++++");
        cat1.eat("cat treats");
        cat2.eat("fish");
        cat3.eat("sish kebab");
        System.out.println("+++++++++++++++");
        cat1.eat("water");
        cat2.eat("milk");
        cat3.eat("coffe");




    }
}
