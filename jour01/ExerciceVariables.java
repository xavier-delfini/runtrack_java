public class ExerciceVariables {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;
        System.out.println("La valeur de num1 est "+num1+" et la valeur de num2 est "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("La valeur de num1 est "+num1+" et la valeur de num2 est "+num2);
    }
}
