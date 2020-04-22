package day14_StringClass;

public class practice {

    public static void main(String[] args) {

        String gmail = "cybertekschool@gmail.com";
        String userinputgmail = "CybertekSchool@gmail";
        boolean result = gmail.equalsIgnoreCase(userinputgmail); // true

        if(result){
            System.out.println("Logged in");
        }
        /*
        valid password must contain a special characters such as(!,_,$)
        valid password should not contain spaces
         */
        String PassWord = "mmasd1235";
        if(PassWord.contains(" ")){
            System.out.println("Password cannot have space in it");
        }else{
            System.out.println("valid password");
        }

        /*
        every web site has "www." at the beginning of the web address
         */
        String webAdress = "Www.amazon.com";
        webAdress = webAdress.toLowerCase();

        if(webAdress.startsWith("www.")){
            //                false
            System.out.println("valid");
        }
        /*
        every single gmail addres ands with @gmail.com
         */
        String email = "CybertekSchool@Yahoo.com";

        if(email.endsWith("@gmail.com")){
            System.out.println("valid gmail");
        }else{
            System.out.println("invalid gmail");
        }


    }
}
