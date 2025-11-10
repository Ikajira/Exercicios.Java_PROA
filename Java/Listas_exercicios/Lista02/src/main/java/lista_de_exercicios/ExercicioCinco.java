package lista_de_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira qual foi o seu prato: ");
        String prato = entrada.next();

        int cal1 = 0;
        switch (prato){
            case "Vegetariano": cal1 = 180; break;
            case "Peixe": cal1 = 230; break;
            case "Frango": cal1 = 250; break;
            case "Carne": cal1 = 350; break;
        }

        System.out.println("Insira qual foi o seu prato: ");
        String sobremesa = entrada.next();

        int cal2 = 0;
        switch (sobremesa){
            case "Abacaxi": cal2 = 75; break;
            case "Sorvete diet" cal2 = 110; break;
            case "Mouse diet" cal2 = 170; break;
            case "Mouse chocolate" cal2 = 200; break;
        }

        System.out.println("Insira qual foi o sua bebida: ");
        String bebida = entrada.next();

        int cal3 = 0;
        switch (bebida){
            case "Chá": cal3 = 20; break;
            case "Suco de laranja" cal3 = 70; break;
            case "Suco de Melão" cal3 = 100; break;
            case "Refrigerante diet" cal3 = 65; break;
        }

        int calTotal = (cal1 + cal2 + cal3);

        System.out.println("As calorias totais da sua refeição se encontram em: " + calTotal);
    }
}
