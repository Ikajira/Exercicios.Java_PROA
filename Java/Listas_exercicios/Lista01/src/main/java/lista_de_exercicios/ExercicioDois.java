package lista_de_exercicios;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;

        System.out.println("\nRaio do círculo: " + raio);
        System.out.printf("Área do círculo: %.2f\n", area);
        System.out.printf("Perímetro do círculo: %.2f\n", perimetro);
    }
}
