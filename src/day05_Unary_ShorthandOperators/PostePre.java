package day05_Unary_ShorthandOperators;

public class PostePre {
    public static void main(String[] args) {

        // pre change the value of the veriable immediatly

        int a = 100;
        System.out.println(++a);  //101
        System.out.println(a); //101

        int b = 100;
        System.out.println(--b);  //99
        System.out.println(b);  //99
        int c = 50;
        System.out.println(c);
        System.out.println(--c);
        System.out.println(c);
        // post: first passes the current value, then eventially changes the variable' value

        int d = 100;
        System.out.println(d++);  // 100
        System.out.println(d);  //101

        int B = 100;
        System.out.println(B--); //100
        System.out.println(B);  //99

        // post & pre examples:
        int z = 10;
        int x = ++z;  // at line x is increased by 1
        System.out.println(x); //11
        System.out.println(z); //11

        int s = 10;
        int f = s++; //10, after line 36, the value of is will be increase by 1

        System.out.println(f); //10
        System.out.println(s); // 11
        double t1 = 3.5;
        double t2 = t1 --; // 3.5, after line 41 t1 will be decreased by 1
        System.out.println(t2); ///3.5
        System.out.println(t1); //2.5
        int num = 35;
        System.out.println(num++); //35, after line 45 the value of num will be 36
        System.out.println(num--); //36
        System.out.println(num);






    }
}
