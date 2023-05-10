import java.util.Scanner;

public class Pyramide {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer la taille de votre pyramide");
        String userinput1 = input.nextLine();
        int nombre = Integer.parseInt(userinput1);
        String pyramide="";
        int i=0;
        while (i<nombre){
            pyramide=pyramide+"*";
            System.out.println(pyramide);
            i++;
        }
    }
}
