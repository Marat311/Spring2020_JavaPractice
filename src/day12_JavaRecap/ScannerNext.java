package day12_JavaRecap;
//import PackageName.classname;
import java.util.Scanner;
public class ScannerNext {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
       // String str = scan.next();
      //  System.out.println(str);  // next() only takes first word
        // 7921 JonesBranch Dr, McLean VA, 22034

        String fullAdress = "";
        System.out.println("Enter number of the bilding: ");
        short Bnumber = input.nextShort();
        fullAdress += Bnumber+" "; // fullAdress = fullAdress + " ";
        System.out.println("Enter your street name: ");
        String streetName = input.next();
        fullAdress += streetName +" ";

        System.out.println("Enter the type of the road");
        String roadType = input.next();
        fullAdress += roadType+ ", ";

        System.out.println("Enter city name, state, zipcode: ");
        String cityName = input.next();
        fullAdress += cityName+" ";
        String stateName = input.next();
        fullAdress += stateName+ ", ";
        int zipCode = input.nextInt();
        fullAdress += zipCode;
        System.out.println("Adress is: "+fullAdress);




    }
}
