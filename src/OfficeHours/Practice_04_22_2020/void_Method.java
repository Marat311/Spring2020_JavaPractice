package OfficeHours.Practice_04_22_2020;

public class void_Method {
    public static void main(String[] args) {
        System.out.println("Hello Batch 18 ");
        System.out.println("Hello Batch 18 ");
        System.out.println("Hello Batch 18 ");
        System.out.println("Hello Batch 18 ");
        System.out.println("Hello Batch 18 ");

        System.out.println("=====================");
        print();
        System.out.println("================");

        boolean USCitizen = true;
        int age = 21;

        Vote(age, USCitizen);
        Vote(35, false);

        System.out.println("==================");

        //28
        EligibleToBuCig(17);
    }
    public static void print(){
        System.out.println("Hello Batch 18 ");
        System.out.println("Hello Batch 18 ");
        System.out.println("Hello Batch 18 ");
        System.out.println("Hello Batch 18 ");
        System.out.println("Hello Batch 18 ");
    }
    // write a function that can identify if a reson is eligible to vote
    // must know: age, UScitizen
    public static void Vote(int age, boolean USCitizen){  // if we have VOID-dont need add "return"
        boolean eligibleToVote = age>18 && USCitizen==true;
        if(eligibleToVote){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote yet");
        }
    }


    //  write a method if a person is eligible to buy cigaret
    // MUST know: age,

    public static void EligibleToBuCig(int age){
        if(age>18){
            System.out.println("Eligible to buy");
        }else{
            System.out.println("Not eligible to buy");
        }
    }

}
