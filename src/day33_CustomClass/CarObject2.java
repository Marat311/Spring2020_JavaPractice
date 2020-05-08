package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject2 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setCarInfo("BMW", "X5", 2020, "Red" );
        car1.getCarInfo();

       Car car2 = new Car();
       car2.setCarInfo("Mercedes", "GLK", 2015, "white");
       car2.getCarInfo();

       Car car3 = new Car();
       car3.setCarInfo("Honda", "CRV", 2019, "grey");
       car3.getCarInfo();

       Car car4 = new Car();
       car4.setCarInfo("Toyota", "Corola", 2020, "pink");
        System.out.println("++++++++++++++++++++++++++++++++");
       Car[] cars = {car1, car2, car3 };
       for(int i = 0; i < cars.length; i++){
           cars[i].getCarInfo();
       }
        System.out.println("2++++++++++++++++++++++++++++");

       for(Car eachCar:cars){
           eachCar.getCarInfo();
       }
        System.out.println("3+++++++++++++++++++++++++++");

        System.out.println(car1);

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(list1);  // toString method gets executed automatically



    }
}
