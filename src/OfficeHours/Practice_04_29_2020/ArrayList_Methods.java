package OfficeHours.Practice_04_29_2020;

import java.util.ArrayList;

public class ArrayList_Methods {
    /*
    ArrayList: does not support primitive
               size is dynamic (size is auto-adjusted)
               has index numbers
    add(), get(), size(), set(), remove(), clear(); indexOf(); lastIndexOf();

    add(): inserting object
    set(): replacing object
    remove(int):
    remove(Object)
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
                list.add (10);
                list.add(20);
                list.add(1,30); // add the element at the given index




        System.out.println(list);
        System.out.println(list.size());

        // [10,20,30]
        //   0  1  2


        list.get(2); // Integer 20,

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");

        //{A, B, C, D}

        list2.add(2, "E");  //{A, B, E, C, D}
        System.out.println(list2);

        for(int i = 0; i<list2.size(); i++){  // i: 0,1,2,3,4
            String str = list2.get(i);
            System.out.println(str);
        }
        System.out.println("==========================");

        for(String each:list2){
            System.out.println(each);  // each elements
        }

        // list2 : {A, B, E, C, D}; replace C with F

        list2.set(3, "F");
        System.out.println(list2);

        // list2: //{A, B, E, F, D}
        //           0  1  2  3  4

        list2.remove(3);
        System.out.println(list2);

       boolean r1 =  list2.remove("A");  //{B, E, D}
        System.out.println(list2);
        System.out.println(r1);

        boolean r2 = list2.remove("C");
        System.out.println(r2);

        list2.clear();
        System.out.println(list2.size());
        System.out.println(list2);




    }

}
