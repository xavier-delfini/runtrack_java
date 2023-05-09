public class Facture {
    public static void main(String[] args) {
        float prix = 49.99F;
        int quantite = 3;
        float tarifHT= prix * quantite;
        System.out.println("Le montant total est : "+tarifHT);
        float tva = tarifHT *0.20F;
        System.out.println("Le montant de la taxe est : "+tva);
        float tarifTTC = tva + tarifHT;
        System.out.println("Le montant total à payer est : "+tarifTTC);

    }
}
