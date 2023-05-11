import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args){
        int[] tableau = new int[10];
        Random random = new Random();

        for (int i = 0; i< tableau.length; i++){
            tableau[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(tableau));
    }
}
