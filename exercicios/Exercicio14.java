package exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char tipoConsumidor = ' ';
        double energiaConsumida = 0.0, valorPago = 0.0;

        System.out.println("Digite o tipo de consumidor (I - Industrial, C - Comercial, R - Residencial): ");
        tipoConsumidor = scanner.next().toUpperCase().charAt(0);

        System.out.println("Digite o valor consumido de energia: ");
        energiaConsumida = scanner.nextDouble();

        if (tipoConsumidor == 'I') {
            valorPago = 0.68 * energiaConsumida + 34;
        } else if (tipoConsumidor == 'C') {
            valorPago = 0.68 * energiaConsumida + 34;
        } else if (tipoConsumidor == 'R') {
            valorPago = 0.68 * energiaConsumida + 34;
        } else {
            System.out.println("Tipo de consumidor inválido");
        }

        System.out.printf("O valor total a ser pago é de R$ %.2f", valorPago);

        scanner.close();
    }
}
