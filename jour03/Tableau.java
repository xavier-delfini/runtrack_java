
import java.util.Arrays;
public class Tableau {
    public static void main(String[] args){
        //Job1
        int[] tableau = new int[5];
        tableau[0] = 10;
        tableau[2] = 2;
        tableau[4] =69;
        System.out.println(Arrays.toString(tableau));
        System.out.println(tableau[1]);
        //Job2
        int[] monTableau = {12,6,76,89};
        System.out.println(Arrays.toString(monTableau));
        monTableau[0] = 24;
        monTableau[1] = 12;
        monTableau[2] = 152;
        monTableau[3] = 178;
        System.out.println(Arrays.toString(monTableau));
        //Job3
        String[] prenoms = {"Josette","John","Myrtille","Marc"};
        System.out.println(prenoms[1]);
        prenoms[2] = "Mireille";
        System.out.println(Arrays.toString(prenoms));
    }
}
