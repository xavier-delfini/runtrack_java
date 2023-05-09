import java.util.Scanner;


public class SwapValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer votre première chaine de caractère :");
        String chaine1 = input.nextLine();
        System.out.println("Veuillez entrer votre seconde chaine de caractère :");
        String chaine2 = input.nextLine();
        System.out.println(chaine1);
        System.out.println(chaine2);
        chaine1 = chaine1 + chaine2;
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length());
        chaine1 = chaine1.substring(chaine2.length());
        System.out.println(chaine1);
        System.out.println(chaine2);
    }
}
