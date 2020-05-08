package OfficeHours.Practice_05_06_2020;

public class VALVe {
    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Marina", "SDET", 120000, 789);
        Tester tester2 = new Tester();
        tester2.setInfo("Alexey", "Junior Tester", 100000, 456);

        Tester tester3 = new Tester();
        tester3.setInfo("Venya", "QA", 80000, 123);

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.hireTester(tester3);
        scrum1.hireTester(tester1);
        scrum1.hireTester(tester2);

        scrum1.fireTester(123);

      //  scrum1.testersTeam  //returns the testersTeam arrayList scrum1
        for(Tester each:scrum1.testersTeam){  // prints out everysingle tester from scrumteam
            System.out.println(each);
        }
        System.out.println("==========================");

        Developer dev1 = new Developer();
        dev1.setInfo("Jack Niklson", "Senior developer", 112100, 112233);
        Developer dev2 = new Developer();
        dev2.setInfo("Will Smitt", "Junior Developer", 80750, 445566);

        scrum1.hireDeveloper(dev1);
        scrum1.hireDeveloper(dev2);

        scrum1.fireDeveloper(112233);
        System.out.println(scrum1.devTeam.size() );

        for(Developer eachdev:scrum1.devTeam){// arraylist of developer in scrum team
            System.out.println(eachdev);
        }
        System.out.println("In my scrum team, We have "+scrum1.testersTeam.size()+" testers and "+scrum1.devTeam.size()+" developers");


        /*
        create scrum2: 4 dev, 2 testers
        create scrum3: 5 dev, 3 testers

        create an array of scrum: {scrum1, scrum2, scrum3}
        iterator the array to print out all the testers who have salsary>120000
        2. print out all the developers who have salary < 12000
        create an ArrayList of scrum: {scrum1, scrum2, scrum3 };
        1. remove all the testres who have salary<100000;
        2. remove all dev who have salary < 120000;

        do not create any Arraylist of testers or dev,
        use the arrayList in ScrumTeam class only
         */
    }
}
