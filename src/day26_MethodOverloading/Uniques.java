package day26_MethodOverloading;


public class Uniques {
    public static void main(String[] args) {
        String str = "ABBCDHHT";
        String result = ""; //A

        for (int i = 0; i < str.length(); i++) {
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }

        System.out.println(result);

        System.out.println("=========================");

        String str2 = "Cybertek";
        String result2 = uniques(str2);
        System.out.println(result2);

    }

    public static String uniques(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int num = frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static int frequency(String str, char ch) {  // count the char frequency
        char[] arr = str.toCharArray();  //[A, A, A]

        int count = 0;
        for (char each : arr) {  //3
            if (each == ch) {
                count++;
            }
        }
        return count;
    }
}
