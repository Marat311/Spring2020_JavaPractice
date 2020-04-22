package day17_WhileLoops;

public class removeDuplicates {
    public static void main(String[] args) {

        String str = "Cybertek school is greater please".toLowerCase();  // count "e"
        int count = 0;  // 6
        String word = "s".toLowerCase();

        while(str.contains(word)){ // can change to words "Cybertek"
            count++;
            str = str.replaceFirst("s","");  //after counting the first "Java" we need to remove it from the str
        }           // count, how many words will be
        System.out.println(count);


    }
}
