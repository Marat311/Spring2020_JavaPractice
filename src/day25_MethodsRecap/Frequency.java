package day25_MethodsRecap;

public class Frequency {

    public static void main(String[] args) {

        String str1 = "JavaJavaJavaJavaJava";
        String str2 = "Java";

        int count = 0;

        while(str1.contains(str2)){
            count++;   //+1
            str1 = str1.replaceFirst(str2, "");
            //we need to make that we are not counting the same index over again
        }
        System.out.println(str1);
        System.out.println(count);
        System.out.println("========================================");

        String a = "python python python python";
        String b = "python";

        int num = Frequency(a,b);
        System.out.println(num);


    }

    public static int Frequency(String str1, String str2){
        int count = 0;
        while(str1.contains(str2)){
            count++;   //+1
            str1 = str1.replaceFirst(str2, "");
            //we need to make that we are not counting the same index over again
        }
        return count;
    }

}
