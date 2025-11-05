package lista_de_exercicios;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o valor do depósito mensal: R$ ");
        float depositoMensal = entrada.nextFloat();

        System.out.print("Insira a taxa de juros mensal (%): ");
        float taxaJuros = entrada.nextFloat();

        double taxaDecimal = taxaJuros / 100.0;
        double montante = 0;

        System.out.println("Evolução mensal:");
        for (int mes = 1; mes <= 12; mes++) {
            montante = (montante + depositoMensal) * (1 + taxaDecimal);
            System.out.printf("Mês %2d: R$ %.2f", mes, montante);
        }

        double totalDepositado = depositoMensal * 12;
        double jurosObtidos = montante - totalDepositado;
        double rendimentoPercentual = (jurosObtidos / totalDepositado) * 100;

        System.out.printf("Total depositado:    R$ %.2f", totalDepositado);
        System.out.printf("Juros obtidos:       R$ %.2f", jurosObtidos);
        System.out.printf("Montante final:      R$ %.2f", montante);
        System.out.printf("Rendimento:          %.2f%%", rendimentoPercentual);
    }
}