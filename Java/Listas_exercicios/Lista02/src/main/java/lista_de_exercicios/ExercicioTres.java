package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o salário para calcular o aumento: ");
        double salario = entrada.nextFloat();

        if (salario <= 500) {
            System.out.println("O salário não teve nenhum aumento.");
            
        } else if ((salario >= 501) && (salario <= 1000)) {
            double aumentoSalarial = salario * 0.30;
            double salarioTotal = salario + aumentoSalarial;

            System.out.println("O salário atual é: "+ salarioTotal);

        } else if ((salario >= 1001) && (salario <= 3000)) {
            double aumentoSalarial = salario * 0.40;
            double salarioTotal = salario + aumentoSalarial;

            System.out.println("O salário atual é: "+ salarioTotal);

        } else if ( salario >= 3001) {
            double aumentoSalarial = salario * 0.50;
            double salarioTotal = salario + aumentoSalarial;

            System.out.println("O salário atual é: "+ salarioTotal);
        }

    }
}