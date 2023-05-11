public class ValeursUnique {
    public static void main(String[] args){
        int[] tableau = {4,1,6,8,2,4,7,1,2,5,9};
        int[] tableauUnique;
        for (int i = 0; i < tableau.length; i++){
            boolean Unique = true;
            for(int j = 0; j <i; j++){
                if(tableau[j] == tableau[i]){
                    Unique = false;
                    break;
                }
            }
            if (Unique == true){
                System.out.println(tableau[i]);
            }
        }

    }
}
