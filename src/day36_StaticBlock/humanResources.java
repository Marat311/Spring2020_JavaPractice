package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Developer;

public class humanResources {

    static Developer dev1 = new Developer();
  //  dev1.setInfo("Marina", "developer", 150000, 123);

    static Developer dev2 = new Developer();
    static Developer dev3 = new Developer();
    static Developer dev4 = new Developer();
    static Developer dev5 = new Developer();

  /*  public static void main(String[] args) {
        dev1.setInfo("Marina", "developer", 150000, 123);
    }

   */
    static{
        dev1= new Developer();
        dev1.setInfo("Marina", "developer", 150000, 123);
  }
}
