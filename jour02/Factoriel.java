import java.util.Scanner;

public class Factoriel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre");
        String userinput1 = input.nextLine();
        int nombre = Integer.parseInt(userinput1);
        int i=1;
        int resultat = nombre;

        while(i!=nombre){
            resultat =resultat * i;
            i++;
        }
        System.out.println("La factoriel du nombre "+nombre+" est "+resultat);
    }
}
