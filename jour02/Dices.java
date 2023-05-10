
public class Dices {
    public static void main(String[] args){
        int i=1;
        int combinaisons=0;
        while(i<7){
            int j=1;
            while(j<7){
                int k=1;
                while(k<7){
                    System.out.println(i+" - "+j+" - "+k);
                    k++;
                    combinaisons++;
                }
                j++;
            }
            i++;
        }
        System.out.println("Il y a "+combinaisons +"combinaisons possibles");
    }
}
