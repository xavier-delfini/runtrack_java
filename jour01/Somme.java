import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer le premier nombre:");
        String userinput1 = input.nextLine();
        int nombre1 = Integer.parseInt(userinput1);
        System.out.println("Veuillez entrer le premier nombre:");
        String userinput2 = input.nextLine();
        int nombre2 = Integer.parseInt(userinput2);
        int resultat= nombre1+nombre2;
        System.out.println(resultat);
    }
}
