package day19_Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        String [] friends = {"Kuzzat", "Asya", "Saim", "Akbar", "Nurifjon", "Guljannat", "Muradil"};
        //                   0          1      2        3        4             5            6

      /*
        System.out.println(friends[6]);
        String s1 = friends[2];
        System.out.println(s1);
*/
      for (int i = 0; i<=6; i++){
          String name = friends[i];
          System.out.println(name);
      }

      String[] emails = {"cybertek@yahoo.com", "cyertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};
      // print all the users who registered with their gmail

        // max: 4

        for(int i = 0; i<= 3; i++){
            String email = emails[i];

            if(email.endsWith("@gmail.com"))
            System.out.println(email);
        }





    }
}