package lista_de_exercicios;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {

        int primeiroValor;
        int segundoValor;
        int valorTrocado;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o primerio valor: ");
        primeiroValor = entrada.nextInt();

        System.out.println("Insira o segundo valor: ");
        segundoValor = entrada.nextInt();

        int valorTrocadoUm = segundoValor;
        int valorTrocadoDois = primeiroValor;

        System.out.println("Qual dos valores você gostaria de saber primeiro? (responda com 1 ou 2)");
        valorTrocado = entrada.nextInt();

        if (valorTrocado == 1){
            System.out.println("O primeiro valor é: " + valorTrocadoUm);
            System.out.println("O segundo valor é: " + valorTrocadoDois);
        } else if (valorTrocado == 2){
            System.out.println("O segundo valor é: " + valorTrocadoDois);
            System.out.println("O primeiro valor é: " + valorTrocadoUm);
        } else {
            System.out.println("ERRO. Responda essa mensagem apenas com 1 ou 2.");
        }
    }
}
