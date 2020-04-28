package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice {
    public static void main(String[] args) {

        ArrayList<String> shopList = new ArrayList<>();

        shopList.add("Milk");  //size: 1
        shopList.add("Coffe"); // size: 2
        shopList.add("Bread"); // size: 3
        shopList.add("Toilet paper"); //size: 4
        shopList.add ("Eggs"); //  size: 5
        System.out.println(shopList);
/*
        System.out.println(shopList.get(0));
        System.out.println(shopList.get(1));
        System.out.println(shopList.get(2));
        System.out.println(shopList.get(3));
         */

        for(int i = 0; i<shopList.size(); i++){
            System.out.println(shopList.get(i));
        }

        System.out.println("=================");

        for(String each:shopList){
            System.out.println(each);
        }

        // size():
        int size = shopList.size();
        System.out.println(size);

        int lastIndex = shopList.size()-1;
        System.out.println(lastIndex);





    }
}
