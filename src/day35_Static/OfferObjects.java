package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {

    public static void main(String[] args) {
        Offer offer1 = new Offer();

       offer1.setInfo("VA", "BoA", 100000, true);
        System.out.println(offer1);

        Offer offer2 = new Offer();
        offer2.setInfo("KY", "CapitalOne", 120000, false);

        System.out.println(offer2);

        Offer offer3 = new Offer();
        offer3.setInfo("Wa", "ValVe", 150000, true);

        Offer offer4 = new Offer();
        offer4.setInfo("BayArea", "Google", 70000, false);

        Offer[] offers ={offer1, offer2, offer3, offer4};

        String myLocation = "Wa";

        ArrayList<Offer> accept = new ArrayList<>(Arrays.asList(offers));
     //   accept.removeIf(each -> each.salary<100000  || !each.isFullTime || !each.location.equals(myLocation));  //we remove offer <100 000, or not full time
           accept.removeIf(p->p.salary< 100000);
           accept.removeIf(p->!p.isFullTime);
           accept.removeIf(p->!p.location.equals(myLocation));

        System.out.println(accept.size());

        for(Offer eachOffer:accept){

            System.out.println(eachOffer);
        }

    }
}
