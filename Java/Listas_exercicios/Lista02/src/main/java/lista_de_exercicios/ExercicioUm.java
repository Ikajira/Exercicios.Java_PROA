package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o número desejado: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero é divisivel por 2.");

        } else if (numero % 5 == 0) {
            System.out.println("O numero é divisivel por 5");

        } else if (numero % 10 == 0) {
            System.out.println("O numero é divisivel por 10.");

        } else {
            System.out.println("O numero não é divisivel por 2, 5 ou 10.");
        }
    }
}
