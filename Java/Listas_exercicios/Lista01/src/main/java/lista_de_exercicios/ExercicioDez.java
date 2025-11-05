package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o salário para o aumento: ");
        double salario = entrada.nextDouble();

        double aumento = salario * 0.12;
        double salarioTotal = (salario + aumento);

        System.out.printf("O salário total atualmente é: %.2f" , salarioTotal);
    }
}