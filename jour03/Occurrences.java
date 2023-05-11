import java.util.Collections;

public class Occurrences {
    public static void main(String[] args){
        //Job04
        int[] tableau = {3,7,3,9,8};
        int i=0;
        while(i<tableau.length){
        int j=0;
        int compteur=0;
        while (j <tableau.length){
            if(tableau[i]==tableau[j]){
                compteur++;
            }
            j++;
            }
        System.out.println("Il y a "+compteur+"occurrences de "+tableau[i]+" dans cette liste");
        i++;
        }
    }

}
