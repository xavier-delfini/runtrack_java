import java.util.Scanner;

public class Nombredenumeros {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre");
        String userinput1 = input.nextLine();
        int nombre = Integer.parseInt(userinput1);
        int i=1;
        while (nombre>9){
            nombre=nombre /10;
            i++;
        }
        System.out.println("Le nombre de chiffre dans le nombre entrée est de : "+ i);
    }
}
