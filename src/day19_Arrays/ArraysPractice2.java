package day19_Arrays;

import java.util.Scanner;

public class ArraysPractice2 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};  //  size array - 3

        System.out.println(arr.length); //3

        int[] arr2 = new int [5];
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        String testers [] = new String[3];   // {"Reem", "Madina", "Osman"};
        //  index: 0, 1, 2

        testers[0] = "Reem";
        testers[1] = "Madina";
        testers[2] = "Osman";
        System.out.println(testers[0]);  // Reem
        System.out.println(testers[1]);  // Madina
        System.out.println(testers[2]);  // Osman

        System.out.println(testers.length);

        System.out.println("==================");

        // write a program that asks "enter a name" 10 times, and store each of the names in the array students1

    }
}
