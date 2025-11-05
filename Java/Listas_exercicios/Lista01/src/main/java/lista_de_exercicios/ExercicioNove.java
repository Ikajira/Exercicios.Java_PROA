package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int idadeAnos;
        int idadeMeses;
        int idadeDias;

        System.out.println("Insira a quantidade de anos de vida que tem: ");
        idadeAnos = entrada.nextInt();

        System.out.println("Insira a quantidade de meses de vida que tem: ");
        idadeMeses = entrada.nextInt();

        System.out.println("Insira a quantidade de dias de vida que tem: ");
        idadeDias = entrada.nextInt();

        int anosTotal = idadeAnos * 365;
        int mesesTotal = idadeMeses * 30;
        int diasTotal = anosTotal + mesesTotal + idadeDias;

        System.out.println("Você tem " + diasTotal + " dias de vida.");
    }
}
