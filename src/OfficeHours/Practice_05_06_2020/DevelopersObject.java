package OfficeHours.Practice_05_06_2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class DevelopersObject {

    public static void main(String[] args) {


        Developer developer1 = new Developer();

        developer1.setInfo("Marina", "SDET", 160000, 18121993);
        System.out.println(developer1);

        Developer developer2 = new Developer();
        developer2.setInfo("Leo", "Senior developer", 180000, 123456789);
        System.out.println(developer2);

        developer1.coding();
        developer2.coding();

        developer1.fixingBug();
        developer2.fixingBug();
        System.out.println("==========================");

        Developer arr[] = {developer1, developer2};

     /*   for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
*/

        for(Developer each:arr){
            System.out.println(each.name+" "+each.salary);
        }
        System.out.println("++++++++++++++++++++++++");

        ArrayList<Developer> devList = new ArrayList<>();

        devList.addAll(Arrays.asList(developer1, developer2));

        System.out.println(devList.size());

        for(int j = 0; j < devList.size(); j++){
            System.out.println(devList.get(j));
        }
        for(Developer each:devList){
            System.out.println(each.name+" "+each.jobTitle);
        }



    }
}
