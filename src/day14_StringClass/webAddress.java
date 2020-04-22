package day14_StringClass;

public class webAddress {
    /*
    write a program that can validate if a weba ddress is valid
    valid web address:
            MUST start with www.
            Must ends with  .com, or .edu, .net, .Gov
     */
    public static void main(String[] args) {

        String website = "WWW.cybertek.gov";
        website = website.toLowerCase();
        boolean validEnding = website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov");

        if(website.startsWith("www.") && validEnding){
            System.out.println("Valid address");

        }else{
            System.out.println("Invalid address");
        }



    }
}
