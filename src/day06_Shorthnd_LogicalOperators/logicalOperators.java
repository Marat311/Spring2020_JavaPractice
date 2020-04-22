package day06_Shorthnd_LogicalOperators;

public class logicalOperators {
    public static void main(String[] args) {

        boolean result1= true;
        System.out.println(!result1); //false

        boolean result2 = !(10 + 15 > 15);
        System.out.println(result2); //false

        boolean result3 = ! true == ! false;
        //               false == true ==> false
        System.out.println(result3);

        boolean r1 = "Corona virus" != "End of the World" && "Toilet peper" == "Cure";
                                         //true              &&      false ==> false
        System.out.println(r1);
        boolean r2 = 10 > 15 && 15 < 13;
        //           false && false ==> false
        System.out.println(r2);
        //boolean r3 = 'a4' == 'b4'- 1 && 'b4' + 1= 'c';
        //           97 == 98 - 1 %% 98 + 1 = 99
        System.out.println();

        boolean r4 =  true != false || false == ! true;
        //            true || true ==> true

        System.out.println(r4);

        boolean r5 = true != false && ! false == ! true;
        //           true && false ==> false
        System.out.println(r5);

        boolean r6 = !!!!false;
        //           !!true
        //            ! false
        //             true
        System.out.println(r6);


    }
}
