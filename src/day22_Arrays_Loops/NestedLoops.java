package day22_Arrays_Loops;

public class NestedLoops {
    public static void main(String[] args) {
//                          0   1      0    1    2      0    1    2    3
        char [][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'J', 'H', 'I'} };
        //                   0               1               2
        // each index in arr2D MUST be single dimensional array
/*               i    j
           arr2D[0] [0]  -'A'
           arr2D[0] [1]  -'B'

           arr2D[1] [0] -'C'
           arr2D[1] [1] -'D'
           arr2D[1] [2] -'E'

           arr2D[2] [0] -'F'
           arr2D[2] [1] -'J'
           arr2D[2] [2] -'H'
           arr2D[2] [3] -'I'
 */
        // arr2D[0] ==> {'A', 'B'}
        for (int i=0; i< arr2D[0].length; i++){
            System.out.println(arr2D[0][i]);
        }

        // arr2D[1] ==> {'C', 'D', 'E'}

        for (int i = 0; i<arr2D[1].length; i++){
            System.out.println(arr2D[1][i]);
        }

        // arr2D[] ==> {'F', 'J', 'H', 'I'}
         for (int i =0; i<arr2D[2].length; i++){
             System.out.println(arr2D[2][i]);
        }

        System.out.println("=====================");

         for(int j=0; j<arr2D.length; j++){   // j: index numbers of 1D array; i: index numbers of elements

             for (int i=0; i< arr2D[j].length; i++){  // arr2D[0], arr2D[1], arr2D[2]

                 System.out.println(arr2D[j][i]);
             }

         }


    }
}
