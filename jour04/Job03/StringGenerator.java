package Job03;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class StringGenerator extends Thread {
    int longueur;
    String chaineCaractere = "";
    public StringGenerator(int StringLongueur){
        longueur=StringLongueur;

    }
    public void run(){
        for (int i = 0; i < longueur; i++) {
            Random r = new Random();
            char c = (char) (r.nextInt(26) + 'a');
            chaineCaractere = chaineCaractere + c;
        }
    }
    public String getString(){
        return chaineCaractere;
    }
}
