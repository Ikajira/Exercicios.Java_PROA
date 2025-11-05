package lista_de_exercicios;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {

        float notaUm;
        float notaDois;
        float notaTres;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a primeira nota do aluno (de 0 a 10): ");
        notaUm = entrada.nextFloat();

        System.out.println("Insira a seegunda nota do aluno (de 0 a 10): ");
        notaDois = entrada.nextFloat();

        System.out.println("Insira a terceira nota do aluno (de 0 a 10): ");
        notaTres = entrada.nextFloat();

        float mediaPonderada = (notaUm*2) + (notaDois*3) + (notaTres*5) / 10;

        System.out.println("A média ponderada das notas é: " + mediaPonderada);

    }
}
