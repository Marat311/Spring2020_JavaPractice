package day09_NestedIf_Ternary;

public class ageGroups_NestedIf {

    /*
    write a program that can define the age groups of a person
    age groups are:
    Teenager (<21)
    Adult(>=21 && <55)
    Senior (> 50)
    age cannot be negative or greater than 150
     */
    public static void main(String[] args) {

        int age = 36;
        String result = "";
        if (age < 150 && age >= 0) {
            if (age < 21){
                result = "Teenager";
        } else if (age < 55) {  // age is already greater or equal to 21
            result = "Adult";
        } else {
            result = "Senior";
        }
        }else {
            result = "Invalid Entry";
        }
        System.out.println(result);   // Adult
        System.out.println("====================");

        int age2 = 65;
        String ageGroup2 = "";
        if (age2<150 && age2 > 0){
            ageGroup2= (age2<21) ? "Teenager" : (age2 < 55)?  "Adults" : "Senior";

        }else{
            ageGroup2 = "Invalid entry";
        }
        System.out.println(ageGroup2);




    }
}
