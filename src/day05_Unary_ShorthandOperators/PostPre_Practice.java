package day05_Unary_ShorthandOperators;

public class PostPre_Practice {
    public static void main(String[] args) {

        int a = 50; //50
        a = --a + a++ + a-- + a++;
        // 49 + 49 + 50 + 49 = 197
        System.out.println(a);

        int x = 4;
        int y = x * 4 - x ++;
        // 4 * 4 - 4 = 12
        System.out.println(y);
        int a1 = 1;
        a = -a1-- + a1++ / -a1-- * --a1;
        //   -1 +   0   /   -1    *  -1 = -1
        //-1 + 0 * -1
        //-1 + 0 = -1


        System.out.println(a1);





    }
}
