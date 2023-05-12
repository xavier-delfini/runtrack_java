package Job03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class StringDivided {
    public static void main(String[] args) throws InterruptedException, IOException {
        long startTime = System.nanoTime();
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer un nombre de charactère pour votre chaine de charactère");
        String userinput1 = input.nextLine();
        int nombre = Integer.parseInt(userinput1);
        File FileCreator = new File("Job02/output.txt");
        int i=0;
        if (nombre %2==1){
            i=1;
        }
        StringGenerator FirstHalf = new StringGenerator(nombre/2);
        StringGenerator SecondHalf = new StringGenerator(nombre/2+i);
        FirstHalf.start();
        SecondHalf.start();
        FirstHalf.join();
        SecondHalf.join();
        String result="";
        result=FirstHalf.getString();
        result=result+SecondHalf.getString();
        FileWriter output = new FileWriter("Job03/output.txt");
        output.write(result);
        output.close();
        long tempsExecution =System.nanoTime() -startTime;
        System.out.println("Exécution du programme finalisé en :" + tempsExecution/10000000 +"millisecondes");
    }
}