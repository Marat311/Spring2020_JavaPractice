package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class StringMethods {
    /*
    String methods:
         toCharArray(): returns char array
         split(): splits the string by given str,
     */
    public static void main(String[] args) {

        String str = "Cybertek";
        char []ch = str.toCharArray();  // ['C', 'y', 'b', 'e', 'r', 't', 'e', 'k']
        System.out.println(str.length()==ch.length);   // true

        /*
        str1 = "abc", str2 = "cab"
        ['a', 'b', 'c']
        ['c', 'a', 'b']

         ['a', 'b', 'c']
         ['a', 'b', 'c']

         */

        String str1 = "ABC";
        String str2 = "BAC";
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1, ch2));

        System.out.println("=======================");

        String sentence = "I like to learn java";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int totalWords = words.length;
        System.out.println(totalWords);


          String result = "";
        for (int i = words.length-1;i>=0;  i--){
          //  System.out.print(words[i] +" ");
            result +=words[i]+" ";
        }
        System.out.println(result.trim()); // java learn to like I







    }
}
