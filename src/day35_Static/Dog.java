package day35_Static;

public class Dog {
    String breed;
    static boolean isPet=true;

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.breed = "Husky";
        dog1.isPet = false;

        Dog dog2 = new Dog();
        dog2.breed = "Poodel";

        System.out.println(dog1.breed);
        System.out.println(dog2.breed);

        System.out.println(dog1.isPet);
        System.out.println(dog2.isPet);





    }
}