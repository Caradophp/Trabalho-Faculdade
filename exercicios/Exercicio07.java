package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = 0.0, financiamento = 0.0;

        System.out.println("Digite o valor seu salário");
        salario = scanner.nextDouble();

        System.out.println("Digite o valor do financiamento pretendido: ");
        financiamento = scanner.nextDouble();

        if (financiamento <= (5*salario)) {
            System.out.println("Financiamento concedido");
        } else {
            System.out.println("Financiamento negado");
        }

        System.out.println("Obrigado por nos consultar");

        scanner.close();
    }
}
