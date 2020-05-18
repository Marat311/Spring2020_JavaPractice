package day39_AccessModifier;

public class CarObjects {

    public static void main(String[] args) {
        // new Constructor
        Car car1 = new Car("Toyota");
        System.out.println(car1);

        Car car2 = new Car("BMW", "X6");

        System.out.println(car2);

        Car car3 = new Car("Mersedes", "GLK", 2020);
        System.out.println(car3);

        Car car4 = new Car("Honda", "CRV", 2019, 28000);
        System.out.println(car4);
    }

}
