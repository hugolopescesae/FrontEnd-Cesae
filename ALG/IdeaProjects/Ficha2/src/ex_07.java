import java.util.Scanner;

public class ex_07 {
    public static void main(String[] args) {

        // Scanner
        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num1;

        // Ler num1
        System.out.print("Introduza um número: ");
        num1 = input.nextInt();

        // Definir se o número é par ou ímpar
        if (num1 % 2 == 0) {
            System.out.println("O número que introduziu é par");
        }else{
            System.out.println("O número que introduziu é ímpar");
        }
    }
}
