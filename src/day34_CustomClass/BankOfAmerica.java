package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAmerica {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Deanerys Targarien", 1112233445, "QA", 200000.00);

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Marina", 32457896, "SDET", 230000.00);

        Tester tester3 = new Tester();
        tester3.setTesterInfo("Venya", 987654321, "QA", 150000.00);

        Tester tester4 = new Tester();
        tester4.setTesterInfo("Alexye", 54678912, "SDET", 190000.00);

        Tester tester5 = new Tester();
        tester5.setTesterInfo("Karina", 78941253, "Model", 70000.00);

        ArrayList<Tester> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1, tester2, tester3, tester4, tester5));

        testers.removeIf(p-> !p.jobTitle.contains("SDET"));

        double totalBudjet = 0;
        for(Tester each: testers){
            System.out.println(each);
            totalBudjet+=each.salary;
        }
        System.out.println(totalBudjet);
    }
}
