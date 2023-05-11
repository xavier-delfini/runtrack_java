import java.util.Arrays;

public class AdditionMatrice {
    public static void main(String[] args) {
        int[][] matrice1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrice2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        for (int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(matrice1[i]));
        }

        int[][] resultat = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultat[i][j] = matrice1[i][j] + matrice2[i][j];
            }
            System.out.println(Arrays.toString(resultat[i]));
        }
    }
}
