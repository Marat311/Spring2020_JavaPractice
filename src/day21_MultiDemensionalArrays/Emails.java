package day21_MultiDemensionalArrays;
/*
Task:
    given an array:
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elemnts could be more in the array
    prin all the email addresses excluding the gmail addresses
        NOTE: MUST USE FOR EACH LOOP
 */
public class Emails {
    public static void main(String[] args) {

        String [] emails = {"Cybertek@gmail.com", "Cybertek@Yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for(String eachEmail: emails) { // 10
         /*   if (!eachEmail.endsWith("@gmail.com")) {
                System.out.println(eachEmail);
            }
        */

         if(eachEmail.endsWith("@gmail.com")){
             continue;
         }
            System.out.println(eachEmail);
        }








    }
}
