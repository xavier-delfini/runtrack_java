import java.util.Scanner;
public class MinutesToHours {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez une durée en minutes :");
        String userinput = input.nextLine();
        int minutes = Integer.parseInt(userinput);
        int heures = minutes/60;
        int minutesreste = minutes % 60;
        System.out.println(minutes+" minutes est équivalent à "+heures+" heures et "+minutesreste+" minutes.");
    }
}
