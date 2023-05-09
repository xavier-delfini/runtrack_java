import java.util.Scanner;

public class Compte {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer une nombre:");
        String userinput = input.nextLine();
        int nombre = Integer.parseInt(userinput);
        int i=0;
        while (nombre >=i){
            System.out.println(i);
            i++;
        }
    }
}
