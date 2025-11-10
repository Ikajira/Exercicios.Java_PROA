package Caneta;

import java.util.Scanner;

public class DecisaoObjeto {

    Scanner entrada = new Scanner(System.in);

    void Sim(){
        System.out.println("Qual é o tipo da caneta?");
        String Tipo = entrada.next();

        System.out.println("Qual é a cor da caneta?");
        String Cor = entrada.next();

        System.out.println("Qual a carga da caneta?");
        Integer Carga = entrada.next();

        System.out.println("Qual é a ponta da sua caneta?");
        Integer Ponta = entrada.next();
    }
}
