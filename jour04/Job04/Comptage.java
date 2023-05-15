package Job04;

import java.util.Scanner;

public class Comptage {

    public static void main(String[] args){
        long startTime = System.nanoTime();
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre");
        String userinput1 = input.nextLine();
        int nombre = Integer.parseInt(userinput1);
        int resultat = 0;
        for (int i=0;i<nombre+1;i++){
            System.out.println(i);
            resultat=resultat+i;
        }
        long tempsExecution =System.nanoTime() -startTime;
        System.out.println("Total : "+resultat);
        System.out.println("Exécution du programme finalisé en :" + tempsExecution/10000000 +"millisecondes");

    }

}
