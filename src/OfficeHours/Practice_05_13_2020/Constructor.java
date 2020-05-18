package OfficeHours.Practice_05_13_2020;

public class Constructor {

    public Constructor(){
        System.out.println("Default constructor");
    }


    public static void main(String[] args) {
        Constructor obj = new Constructor();

        Employee employee1 = new Employee("VALVe", 123, 200000);
        System.out.println(employee1.name);
        System.out.println(employee1.id);
        System.out.println(employee1.salary);

        Employee employee2 = new Employee("Apple", 546, 180000);
        System.out.println(employee2);

    }
}

class Employee{

    String name;
    long id;
    double salary;

    public Employee(String name, long id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString(){
        return "Name: "+name+", id: "+id+", salary: "+salary;
    }
}