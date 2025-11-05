package testandovariaveis;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        float peso;
        float altura;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira seu peso: ");
        peso = entrada.nextFloat();

        System.out.println("Insira sua altura: ");
        altura = entrada.nextFloat();

        var imc = peso / (altura*altura);

        System.out.println("Seu IMC é: %.2f" + imc);
    }

}
