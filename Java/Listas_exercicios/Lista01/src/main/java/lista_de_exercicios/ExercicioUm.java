package lista_de_exercicios;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {

        int primeiroValor;
        int segundoValor;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o primeiro valor: ");
        primeiroValor = entrada.nextInt();

        System.out.println("Insira o segundo valor: ");
        segundoValor = entrada.nextInt();

        int soma = (primeiroValor + segundoValor);
        int subtracao = (primeiroValor - segundoValor);
        int multiplicacao = (primeiroValor * segundoValor);
        int divisao = (primeiroValor / segundoValor);

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A subtração dos valores é: " + subtracao);
        System.out.println("A multiplicação dos valores é: " + multiplicacao);
        System.out.println("A divisao dos valores é: " + divisao);
    }
}
