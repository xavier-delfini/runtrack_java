public class PremierEtDernier {
    public static void main(String[] args){
        int nombre= 1234;
        String nombreString = String.valueOf(nombre);
        char premier = nombreString.charAt(0);
        char dernier= nombreString.charAt(nombreString.length() - 1);
        System.out.println("Le premier chiffre de 1234 est : "+premier);
        System.out.println("Le dernier chiffre de 1234 est : "+dernier);

    }
}
