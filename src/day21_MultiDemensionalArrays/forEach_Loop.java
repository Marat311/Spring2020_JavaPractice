package day21_MultiDemensionalArrays;

import java.util.Arrays;

/*
for (DataType variableName: ArrayName){
}
 */
public class forEach_Loop {
    public static void main(String[] args) {

        int[]nums = {1,2,3,4};

        for(int eachElement: nums){
            System.out.println(eachElement);
        }

        String [] students = {"Muhtar", "Asiya", "Marina"};
        for (String eachStudent: students){
            System.out.println(eachStudent);
        }


        int[] arr1 = {10,2,3,4,5,6,7,8,9,1};
        Arrays.sort(arr1); // [1,2,3,4,5,6,7,8,9,10]
        for(int each : arr1){
            if(each<5){
                continue;
            }
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("===========================");

        String sentence = "I like Java";   // Lava like I

        String []words = sentence.split(" "); // [I, like, Java]

        for(String eachWord: words){   //0~2
            System.out.println(eachWord);
        }
        System.out.println("==================");

        for(int i = words.length-1; i>=0; i--){
            System.out.println(words[i]);
        }

    }
}
