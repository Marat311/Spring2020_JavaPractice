package day39_AccessModifier;

public class Car {
    /*
     create a class called Car:
				instance variable:
						brand, model, year, price
				add a constructor that can initialize brand of car
				add a constructor that can initialize brand and model of the car
								(apply constructor call to initalize the brand)
				add a constructor that can initialize the brand, model, year of the car
								(apply constructor call to initialize brand, model)
				add a constructor that can initialize brand, model, year and price of the car
								(apply constructor call to initialize brand, model, year)
				add toString method

     */
    String brand;
    String model;
    int year;
    double price;

    public Car(String brand){

        this.brand = brand;
    }

    public String toString(){
        return year+" "+brand+" "+model+" $"+price;
    }

    public Car(String brand, String model){
        this(brand);
        this.brand = brand;
        this.model = model;
    }

    public Car(String brand, String model, int year){
        this(brand, model); // this.brand = brand, this.model = model;
        this.year = year;
    }

    public Car(String brand, String model, int year, double price){
        this(brand, model, year); // this.brand = brand, this.model = model, this. price = price;
        this. price = price;
    }

}
