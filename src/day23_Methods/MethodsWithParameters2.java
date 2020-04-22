package day23_Methods;

public class MethodsWithParameters2 {
    // create a function can reverse any string

    // "Muhtar" ==> "rahtuM",
    public static void main(String[] args) {

        String name = "Muhtar";
        ReverseString(name);

        String name2 = "Cybertek School";
        ReverseString(name2);



    }
    public static void ReverseString (String str){

        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }






}
