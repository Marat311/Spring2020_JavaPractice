package day07_IfStatements;

public class Vote {
    public static void main(String[] args) {

        int age = 18;
        boolean citizen = true;

        boolean eligible = age >= 18 && citizen == true;
        if(eligible== true){
            System.out.println("You are eligible to vote");
        }
        if (eligible!= true){
            System.out.println(eligible);
        }



    }
}
