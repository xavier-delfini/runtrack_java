import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer votre nom :");
        String nom = input.nextLine();

        System.out.println("Veuillez entrer votre prénom :");
        String prenom = input.nextLine();
        System.out.println("Bienvenue "+ nom +" "+prenom);
    }
}
