package testandovariaveis;

import java.util.Scanner;

public class ExemploTres {
    public static void main(String[] args) {

        float notaUm;
        float notaDois;
        float notaTres;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        notaUm = entrada.nextFloat();

        System.out.println("Digite a segunda nota: ");
        notaDois = entrada.nextFloat();

        System.out.println("Digite a terceira nota: ");
        notaTres = entrada.nextFloat();

        float media = (notaUm + notaDois + notaTres)/3;

        System.out.printf("A média das notas é: %.2f" , media);
    }

}