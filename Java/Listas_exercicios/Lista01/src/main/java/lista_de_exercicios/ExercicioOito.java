package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int valorMultiplicado;
        System.out.println("Insira o numero que deseja calcular a tabuada: ");
        valorMultiplicado = entrada.nextInt();

        for (int contador = 1; contador < 11; contador++) {
            int soma = valorMultiplicado * contador;
            System.out.println(valorMultiplicado + " x " + contador + " = " + soma);
        }
    }
}