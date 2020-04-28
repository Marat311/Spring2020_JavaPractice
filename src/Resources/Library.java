package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    public static int[] sortDescending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }  // sort descending {1,2,3,4}==>{4,3,2,1}

    public static String Reverse(String str){  // can reverse a string and returns string
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
    }   // reverse

 // remove duplicates from string

    // frequency of the string

    // merge two array and return third one

    // max number from array

    // min number from array
    public static String RemoveDuplicates(String str) {
        String result = "";      // AB

        for (int indexNumber = 0; indexNumber < str.length(); indexNumber++) {
            char ch = str.charAt(indexNumber);
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        return result;
    }  //remove duplicates ABCAB ==> ABC


    public static int Frequency(String str1, String str2){
        int count = 0;
        while(str1.contains(str2)){
            count++;   //+1
            str1 = str1.replaceFirst(str2, "");
            //we need to make that we are not counting the same index over again
        }
        return count;
    }  // frequency Str1=AABCDBS, Str2=A ==> 2(count A)


    public static String FrequencyOfChars(String str) {
        String nonDupl = Library.RemoveDuplicates(str);  //ABC
        String result = ""; // contains the frequency of char

        for (int i = 0; i < nonDupl.length(); i++) {
            String ch = "" + nonDupl.charAt(i);  //'A'
            int num = Library.Frequency(str, ch);
            result += ch + num;
        }
        return result;
    }  // frequency Str=AAABCC; ==> A3B1C2

    public static int method(String str){
        return 123;
    }

    public static int Frequency(String str, char ch) {  // count the char frequency
        char[] arr = str.toCharArray();  //[A, A, A]

        int count = 0;
        for (char each : arr) {  //3
            if (each == ch) {
                count++;
            }
        }
        return count;
    } // str, char


    public static int max (ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    } // ArrayList

}