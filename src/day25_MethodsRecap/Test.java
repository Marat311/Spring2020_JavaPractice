package day25_MethodsRecap;

import Resources.Library;

public class Test {

    public static void main(String[] args) {
        // Library.RemoveDuplicates
        String str = "ABCABCBABA";
        String result = Library.RemoveDuplicates(str);

        System.out.println(result);
        System.out.println("=========================");
        // Library.Frequency
        String str1 = "AABBCDEB";
        String str2 = "B";

        int num = Library.Frequency(str1, str2);

        System.out.println(num);

        System.out.println("+++++++++++++++++++++++++++");

        String str3 = "MMMNNNIIIIOOOOOOOOJ";

        String result3 = Library.FrequencyOfChars(str3);

        System.out.println(result3);

    }
}
