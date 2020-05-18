package Resources;
import day39_AccessModifier.AccessModifiers;
public class AccessModifier_Test {
    public static void main(String[] args) {

        AccessModifiers obj = new AccessModifiers();
      //  System.out.println(obj.defaultAccess); //default only accessible in the same packege
        System.out.println(obj.publicAccess); // public accessible everywhere
     //   System.out.println(obj.SSN);

    }
}
