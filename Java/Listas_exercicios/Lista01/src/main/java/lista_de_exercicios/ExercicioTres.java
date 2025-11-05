package lista_de_exercicios;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {

        float base;
        float altura;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a base do triângulo: ");
        base = entrada.nextFloat();

        System.out.println("Insira a altura do triângulo: ");
        altura = entrada.nextFloat();

        float area = (base * altura) / 2;

        System.out.println("A área do triângulo é: " + area);
    }
}