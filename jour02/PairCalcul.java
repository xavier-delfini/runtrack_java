public class PairCalcul {
    public static void main(String[] args) {
        int i = 1;
        int resultat =0;
        while (i != 101) {
            if (i % 2 == 0) {
                resultat=resultat+i;
            }
            i++;
        }
        System.out.println("La somme des nombres pairs entre 1 et 100 est :" + resultat);
    }
}
