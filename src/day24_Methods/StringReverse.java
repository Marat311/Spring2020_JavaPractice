package day24_Methods;

import javax.print.event.PrintEvent;

public class StringReverse {
    public static void main(String[] args) {
        Reverse("Cybertek");
    }

    public static void Reverse(String str){  //ABCD
        String Reverse = "";

        for (int i=str.length()-1; i>=0; i--){
           Reverse +=  str.charAt(i);
        }
        System.out.println(Reverse);
    }
    public static String Reverse2 (String str){
        String Reverse = "";
        for(int i = str.length()-1; i>=0; i--){
            Reverse +=str.charAt(i);
        }
        return Reverse;
    }


}
