package day34_CustomClass;

public class Dogs {
    String breed;
    String size;
    int age;
    String color;
    String name;
    public void setDogInfo(String breed, String size, int age, String color, String name){
        this.breed =breed;
        this.size=size;
        this.age=age;
        this.color=color;
        this.name=name;
        //this keyword is used for calling object instance variable

    }

public String toString(){
        return "DogName: "+name+", Breed: "+breed+", Size: "+size+", Color: "+color+", age: "+age;
}

public void eating(String food){
    System.out.println(name+" is eating "+food);
}

public void drinking(String drink){
    System.out.println(name+" is drinking "+drink);
}

public void play(String toy){
    System.out.println(name+" is playing "+toy);
}
    public void studying(String subject){
        System.out.println(name+" is studying "+subject);
    }
}
