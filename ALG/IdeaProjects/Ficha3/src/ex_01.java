import java.util.Scanner;

public class ex_01 {
    public static void main(String[] args) {

        System.out.println("***** Exercício 01 *****");

        Scanner input = new Scanner(System.in);

        // Declarar Variável
        int num;

        // Apresentar os números pares até o número 300
        for (num = 0;num<=300;num++){
            if (num % 2 == 0){
                System.out.println(num);
                num = num +1;
            }
        }
    }
}
