package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira sua idade para realizarmos o calculo de voto eleitoral: ");
        int idade = entrada.nextInt();

        if (idade < 16){
            System.out.println("Você ainda não tem idade para ser eleitor.");
            
        } else if ((idade >= 18) && (idade <= 60)) {
            System.out.println("Você é Eleitor Obrigatório! bora lá votar.");
            
        } else if ((idade >= 16) && (idade < 18) || (idade >= 65)) {
            System.out.println("Você é Eleitor Facultativo.");
        }

    }
}