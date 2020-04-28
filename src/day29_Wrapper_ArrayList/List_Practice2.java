package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_Practice2 {
    /*

     */
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(-100);
        list.add(-20);
        list.add(-300);
        list.add(-400);
        list.add(-50);


        System.out.println(list);
       int max = Integer.MIN_VALUE;
      // int max = list.get(0);

       for(int i = 0; i<list.size(); i++){
           if(list.get(i)>max){
               max = list.get(i);
           }
       }
        System.out.println(max);

       int max2 = Integer.MIN_VALUE;
       for(Integer each:list){
           if(each>max2){
               max2 = each;
           }
       }
        System.out.println(max2);

       ArrayList<Integer> list2 = new ArrayList<>();
           list2.add(100);
           list2.add(200);
           list2.add(3000);

          int max3 =  max(list2);
        System.out.println(max3);




    }

public static int max (ArrayList<Integer>list){ // returns to the max on ArrayList
    int max = Integer.MIN_VALUE;
       for(int i = 0; i<list.size(); i++){
            if(list.get(i)>max){
            max = list.get(i);
            }
       }
      return max;
    }


}
