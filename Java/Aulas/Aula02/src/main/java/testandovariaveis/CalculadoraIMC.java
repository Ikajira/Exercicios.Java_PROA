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

        float imc = peso / (altura*altura);

        System.out.printf("Seu IMC é: %.2f" , imc);

        if (imc <= 18.5){
            System.out.println("Você está abaixo do peso!");

        } else if ((imc >= 18.5) && (imc <=24.9)) {
            System.out.println("Você está no peso ideal.");

        } else if ((imc >= 25) && (imc <= 29.9)) {
            System.out.println("Você está levemente acima do peso");

        } else if ((imc >= 30) && (imc <= 34.9)) {
            System.out.println("Você está na obesidade grau I");

        } else if ((imc >= 35) && (imc <= 39.9)) {
            System.out.println("Você está na obesidade grau II");

        } else {
            System.out.println("Você está na obesidade mórbida.");
        }

    }

}
