package OfficeHours.Practice_05_06_2020;

import java.util.ArrayList;

public class ScrumTeam {
    ArrayList<Tester> testersTeam = new ArrayList<>();

    ArrayList<Developer> devTeam = new ArrayList<>();

    public void hireTester(Tester testerA){
        testersTeam.add(testerA);

    }

    public void fireTester(long id){

        testersTeam.removeIf(eachTester->eachTester.employeeId == id);
    }

    public void hireDeveloper(Developer developerA){

        devTeam.add(developerA);
    }

    public void fireDeveloper (long id){

        devTeam.removeIf(eachDev-> eachDev.employeeId==id);
    }
}
