package day25_MethodsRecap;

public class RemoveDuplicates_String {

    public static void main(String[] args) {

        String str = "ABAB";
        String result = "";      // AB
                                  //         last index
        for(int indexNumber = 0; indexNumber<str.length(); indexNumber++){
            char ch = str.charAt(indexNumber);
            if(!result.contains(""+ch)){  // result -String, ch-char, ""+ convert ch on String
                    result+=ch; // result concat new result (A+B)
            }
        }
        System.out.println(result);
        System.out.println("==========================");
String str2 = "ABCABCABC";
String result2 = RemoveDuplicates(str2);  //ABC
        System.out.println(result2);

    }

    public static String RemoveDuplicates(String str) {
        String result = "";      // AB

        for (int indexNumber = 0; indexNumber < str.length(); indexNumber++) {
            char ch = str.charAt(indexNumber);
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        return result;
    }
}
