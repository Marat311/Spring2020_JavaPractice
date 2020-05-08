package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Dogs_Objects {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs();
        dog1.setDogInfo("Husky", "Small",4, "White", "Ghost");

     /*
        dog1.breed = "Husky";
        dog1.size = "Small";
        dog1.color = "White";
        dog1.name = "Ghost";
        dog1.age = 4;
      */
/*
        System.out.println( dog1.breed );
        System.out.println(dog1.size);
        System.out.println(dog1.color);
        System.out.println(dog1.name);
        System.out.println(dog1.age);
 */

        Dogs dog2 = new Dogs();
        dog2.setDogInfo("Alabay", "Extra big", 5, "Brown", "Ajdar");

        Dogs dog3 = new Dogs();
        dog3.setDogInfo("Poodle","Miniature",2,"White","Lucy");


        System.out.println( dog1 );
        System.out.println( dog2 );
        System.out.println( dog3 );

        System.out.println("============================================================");
        Dogs dog4 = new Dogs();
        dog4.setDogInfo("Pomeranian", "Small", 3, "White", "Lil");

        Dogs dog5 = new Dogs();
        dog5.setDogInfo("pomeranian", "Small",4, "White", "Ernie");


        ArrayList<Dogs> puppies = new ArrayList<>();
        puppies.addAll( Arrays.asList( dog1, dog2, dog3 ) );
        puppies.addAll(Arrays.asList(dog4, dog5));

        for(int i = 0; i < puppies.size(); i++ ){
            Dogs eachdog  = puppies.get(i);
            System.out.println( eachdog );
        }

        System.out.println("=====================================");

        puppies.removeIf( p -> p.age > 2);

        for(int i = 0; i < puppies.size(); i++ ){
            Dogs eachdog  = puppies.get(i);
            System.out.println( eachdog );
        }

    }

}
