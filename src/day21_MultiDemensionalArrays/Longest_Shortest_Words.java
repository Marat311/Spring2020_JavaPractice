package day21_MultiDemensionalArrays;
/*
2. write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array
 */
public class Longest_Shortest_Words {
    public static void main(String[] args) {

        String[] names = {"Ceeb", "Ana", "JeRax", "Topson", "NoTail"};
        int maxLengthString = names[0].length();  // 4
        int minLengthString = names[0].length();
        String longestWord = "";
        String shortestWord = "";

        for (int i = 0; i < names.length; i++){
            if(names[i].length()> maxLengthString){

                maxLengthString = names[i].length();
                longestWord = names[i];

            }

            if(names[i].length()<minLengthString){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }


        }
        System.out.println(longestWord);
        System.out.println(shortestWord);






    }
}
