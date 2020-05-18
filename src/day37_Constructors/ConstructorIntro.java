package day37_Constructors;


public class ConstructorIntro {
    // public method{ } // constructor name MUST be same with class name


    public ConstructorIntro(int a ){  // constructor with argument
        System.out.println("constructor with argument of int");
    }
    public static void main(String[] args) {

      //  ConstructorIntro obj = new ConstructorIntro( ); //its the same existing constructionInfo
        ConstructorIntro obj2 = new ConstructorIntro(10);

    }
}
