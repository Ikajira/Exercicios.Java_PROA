package lista_de_exercicios;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {

        float salario;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o salário base do funcionário: ");
        salario = entrada.nextFloat();

        double comissao = (salario * 0.05);

        double salarioLiquido = comissao + salario;

        System.out.println("O salário liquido do funcionário é: " + salarioLiquido );

    }
}
