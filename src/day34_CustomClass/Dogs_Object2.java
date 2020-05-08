package day34_CustomClass;

public class Dogs_Object2 {
    public static void main(String[] args) {
        String food1 = "Chiken";
        String food2 = "Fish";

        String drink1 = "milk";
        String drink2 = "coffe";

        String toy1 = "ps4";
        String toy2 = "Piano";
        Dogs dog1 = new Dogs();

        dog1.setDogInfo("Pomeranian", "Small", 3, "White", "Lil");

        Dogs dog2 = new Dogs();

        dog2.setDogInfo("Mops", "Medium", 8, "Beige", "Timon");

        dog2.eating(food1);
        dog1.eating(food2);

        dog1.drinking(drink2);
        dog2.drinking(drink1);

        dog1.play(toy1);
        dog2.play(toy2);

        String subject1 = "Java";
        String subject2 = "Art";

        Dogs dog3 = new Dogs();
        dog3.setDogInfo("poodel", "Small", 5, "White", "Coco");

        Dogs dog4 = new Dogs();
        dog4.setDogInfo("Veirmaranier", "Medium", 1, "Blue", "Arkasha");
        System.out.println("===================");

        Dogs[] dogPark = {dog1, dog2, dog3, dog3};

        for(int i=0; i<dogPark.length; i++){
            dogPark[i].eating("Chicken");
        }

        for(Dogs each:dogPark){
            each.drinking("water");
        }

        for(int i=0; i<dogPark.length; i++){
            dogPark[i].play("football");
        }

        for(Dogs each  : dogPark ){
            each.studying(subject1);
        }



    }
}
