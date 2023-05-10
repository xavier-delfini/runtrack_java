import java.util.Scanner;

/*
Écrire un programme qui permet de vérifier si l’utilisateur à l’age pour travailler. Si
l’utilisateur à moins de 16 ans, il ne peut pas travailler, si son âge est supérieur à 55 ans,
il aura du mal à trouver un emploi et si celui-ci a 67 ans, il est en retraite.
 */
public class Travail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Veuillez entrer votre age");
        String userinput1 = input.nextLine();
        int age = Integer.parseInt(userinput1);
        if (age<16 ){
            System.out.println("Vous êtes trop jeune pour travailler");
        }
        else if((age>=16) && (age<=54)){
            System.out.println("Vous pouvez travailler");
        }
        else if ((age>=55) && (age<=66)){
            System.out.println("Vous avez du mal a trouver un emploi");
        }
        else if (age>=67){
            System.out.println("Vous êtes a la retraite");
        }
        else{
            System.out.println("Une erreur est survenue");
        }
    }
}
