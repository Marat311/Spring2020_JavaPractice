package day21_MultiDemensionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {

        String[]DevTeam = {"Zeynep", "Haider", "Marina", "Muhtar"};
        String []testers = {"Rahman", "Ali","Osman", "Leo"};
        String [] PO = {"Donald", "Barak"};
        String [] testersTeam2 = {"Ilham", "Anna", "Ali", "Olya"};

        String [][]ScrumTeam = {DevTeam, testers, PO};
        //                        0        1

        ScrumTeam[1]=testersTeam2;

        ScrumTeam[0][3]= "Jean";
        System.out.println(ScrumTeam[0][3]);

        String info = ScrumTeam[1][2];
        System.out.println(info);

        System.out.println("====================");

        for(String eachEmployee:ScrumTeam[1]){
            System.out.print(eachEmployee+" ");  //  Ilham Anna Ali Olya
        }
        System.out.println();
        System.out.println("====================");

        System.out.println(ScrumTeam[2][1]);  // Barak





    }
}
