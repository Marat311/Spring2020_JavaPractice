package day20_ArraysContinue;
import java.util.Arrays;
public class ArraysUtilities {
    public static void main(String[] args) {

        int[] arr= {1, 2, 3};
        String r = Arrays.toString(arr);   // array's convert to string
        System.out.println(r); // arrays MUST be convert to string before we print

        String names[]= {"Madina", "Fatih", "Osman"};  // arrays
        System.out.println(Arrays.toString( names)); //  arrays converted to string, then sout working

        double [] nums = {10, 20, 30, 40, 50};  // {10.0, 20.0, 30.0, 40.0, 50.0}
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]+1);






    }


}
