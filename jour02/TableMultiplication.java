import java.util.Scanner;

public class TableMultiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer un chiffre entre 0 et 9");
        String userinput1 = input.nextLine();
        int numero = Integer.parseInt(userinput1);
        if ((numero > -1) && (numero < 10)) {
            int i = 0;
            while(i!=11){
               int result=i*numero;
               System.out.println(i + " X "+ numero +" = "+ result);
               i++;

            }
        }
    }

}
