package Job02;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomString {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre de charactère pour votre chaine de charactère");
        String userinput1 = input.nextLine();
        int nombre = Integer.parseInt(userinput1);
        String chaineCaractere = "";
        File FileCreator = new File("Job02/output.txt");
        try {
            FileWriter output = new FileWriter("Job02/output.txt");
            for (int i = 0; i < nombre; i++) {
                Random r = new Random();
                char c = (char) (r.nextInt(26) + 'a');
                output.write(c);


                chaineCaractere = chaineCaractere + c;
            }
            output.close();
        }
        catch (IOException e) {
            System.out.println("Une erreur est survenue.");
        }

        System.out.println(chaineCaractere);
        long tempsExecution =System.nanoTime() -startTime;
        System.out.println("Exécution du programme finalisé en :" + tempsExecution/10000000 +"millisecondes");
    }
}
