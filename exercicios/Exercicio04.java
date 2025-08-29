package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codico = 0;
        double salario = 0.0, novoSalario = 0.0, diferenca = 0.0;

        System.out.println("Digite seu salário: ");
        salario = scanner.nextDouble();

        System.out.println("Digite o código do seu cargo: ");
        codico = scanner.nextInt();

        switch (codico) {
            case 101:
                novoSalario = salario * 1.1;
                break;
            case 102:
                novoSalario = salario * 1.2;
                break;
            case 103:
                novoSalario = salario * 1.3;
                break;
            default:
                novoSalario = salario * 1.05;
                break;
        }

        diferenca = novoSalario - salario;

        System.out.printf("Salário antigo: R$ %.2f\n", salario);
        System.out.printf("Novo salário:  R$ %.2f\n", novoSalario);
        System.out.printf("Direrença:  R$ %.2f", diferenca);

        scanner.close();
    }
}
