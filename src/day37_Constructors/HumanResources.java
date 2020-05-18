package day37_Constructors;

public class HumanResources {

    static employee employee1 = new employee();
    static employee employee2 = new employee();
    static employee employee3 = new employee();
    static employee employee4 = new employee();
    static employee employee5 = new employee();

  /*  public static void main(String[] args) {

        employee1.setINfo("MArina", 123, 987654321, "QA", 100000, 'F');
        employee2.setINfo("Vwnya", 456, 654321987, "SDET", 120000, 'M');
        employee3.setINfo("Alexey", 789, 123456789, "QA", 90000, 'M');
        employee4.setINfo("Anna", 147, 456123489, "Busness analist", 150000, 'F');
        employee5.setINfo("Poul", 987, 852963741, "Scrum muster", 170000, 'M');


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
    }

   */
static{
    employee1.setINfo("MArina", 123, 987654321, "QA", 100000, 'F');
    employee2.setINfo("Vwnya", 456, 654321987, "SDET", 120000, 'M');
    employee3.setINfo("Alexey", 789, 123456789, "QA", 90000, 'M');
    employee4.setINfo("Anna", 147, 456123489, "Busness analist", 150000, 'F');
    employee5.setINfo("Poul", 987, 852963741, "Scrum muster", 170000, 'M');


}

}
