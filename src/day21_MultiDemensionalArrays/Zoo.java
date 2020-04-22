package day21_MultiDemensionalArrays;

public class Zoo {
    public static void main(String[] args) {

        String[] wildAnimals = {"Tiger", "Lion", "Monkey", "Turtle", "pig"};
        String[]birds = {"eagle", "Ducks", "Peacock", "Chicken"};
                    //      0         1        2         3
        String [][]zoo = {wildAnimals, birds};

        String kfs=zoo[1][1];  // chicken
        System.out.println(kfs);
        System.out.println("=========================");

        for(String eachAnimals:zoo[0]){
            if(eachAnimals.equals("pig")){
                continue;
            }
            System.out.println(eachAnimals);   // 5
        }
        System.out.println("========================");

        for(String eachBirds:zoo[1]){    //4
            if(eachBirds.equals("Chicken")){   // delete chicken
                continue;
            }
            System.out.println(eachBirds);
        }



    }
}
