package day16_ForLoop;

public class continue_Practice {
    public static void main(String[] args) {
                // skop printing Y, H, J, D

        for (char ch='Z'; ch>='A';ch--){
            if(ch =='Y' || ch=='J' || ch=='H' || ch=='D'){
                continue;
            }
            System.out.print(ch+" ");
        }
        System.out.println();

        for(int i = 1; i <= 100; i++){
            if(i%3==0 || i%5==0){
                continue;
            }
            System.out.print(i+" ");
        }



    }
}
