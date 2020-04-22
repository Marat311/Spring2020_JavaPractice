package day15_ForFloop;

public class forLoop_practice {
    public static void main(String[] args) {

        String resultodd = "";
        for (int num=1; num <=100; num +=2) {
           // System.out.print(num+" " );
            // result += num +" ";
            resultodd = resultodd +num+" ";

        }
        System.out.println(resultodd);

        String resultEven = "";
        for(int num = 2; num <=100; num +=2){
           // System.out.print(num+" ");
            resultEven += num +" ";
        }
        System.out.println(resultEven);

    }
}
