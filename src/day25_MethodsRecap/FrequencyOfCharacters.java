package day25_MethodsRecap;

import Resources.Library;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "AABBCC";  //A2B2C2
        String nonDupl = Library.RemoveDuplicates(str);  //ABC
        String result = "";

        for (int i = 0; i < nonDupl.length(); i++) {

            String ch = "" + nonDupl.charAt(i);  //'A'
            int num = Library.Frequency(str, ch);

            // System.out.print(ch + num);
            result += ch + num;
        }
        System.out.println(result);

    }

    public static String FrequencyOfChars(String str) {
        String nonDupl = Library.RemoveDuplicates(str);  //ABC
        String result = ""; // contains the frequency of char

        for (int i = 0; i < nonDupl.length(); i++) {
            String ch = "" + nonDupl.charAt(i);  //'A'
            int num = Library.Frequency(str, ch);

            result += ch + num;
        }
        return result;
    }
}
