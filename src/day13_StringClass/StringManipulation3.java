package day13_StringClass;

public class StringManipulation3 {
    public static void main(String[] args) {
        String str = "I like Java programming";
        int num = str.indexOf("J");
        System.out.println(num);

        String str2 = "Cybertek school is awesome";
        //             0123456789
        int firstS = str2.indexOf("s"); //9
        int seconds = str2.indexOf("is")+1;
        // str2.indexOf("is)==> returns the index number of i
        int thirdS = str2.indexOf("awesome")+4;
        System.out.println(firstS);
        System.out.println(seconds);
        System.out.println(thirdS);
        int maxInumber = "Cybertek".length()-1;  // 8
        System.out.println(maxInumber);
        String names = "Muhtar";
        int a1 = names.indexOf("Good Guy");
        System.out.println(a1);
        String fullname = "Marina Velitskaia";
        String firstname = fullname.substring(0,fullname.indexOf(" "));
        String lastname = fullname.substring(fullname.indexOf(" ")+1);
        System.out.println(firstname);
        System.out.println(lastname);



    }
}
