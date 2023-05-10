public class SommeChiffres {
    public static void main(String[] args){
        int nombre = 1234;
        int resultat=0;
        String nombreString = String.valueOf(nombre);
        int i=0;
        while(i<4){
            resultat=resultat+Character.getNumericValue(nombreString.charAt(i));
            i++;
        }
        System.out.println("La somme des chiffres est : "+resultat);
    }
}
