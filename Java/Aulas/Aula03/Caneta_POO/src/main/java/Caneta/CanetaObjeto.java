package Caneta;

import java.util.Locale;
import java.util.Scanner;

public class CanetaObjeto {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, como você está? fiquei sabendo sobre uma caneta que você tem para me mostrar..");
        System.out.println("Quer me falar sobre ela? (S) para sim e (N) para não. ");
        String SimOuNao = entrada.next();

        if (SimOuNao == "S") {
            System.out.println("Ok! vamos seguir então.");
            System.out.println();

        } else if (SimOuNao == "N") {
            System.out.println("Tudo certo, até a proxima.");

        } else {
            System.out.println("Por favor, responda apenas com (S) ou (N)");
        }
    }
}