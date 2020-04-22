package day16_ForLoop;

public class breakStatement {
    public static void main(String[] args) {

        for (int i = 1; i<=5; i++){ // i: 1,2,3,4,5


            if(i==3) {
                break;
            }
            System.out.println("Hello World");

        }

        for (char i = 'a'; i<='z'; i++){
            System.out.println(i);
            if(i=='d'){
                break;
            }

        }



    }
}
