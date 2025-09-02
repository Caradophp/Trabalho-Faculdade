package exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldoMedio = 0.0, credito = 0.0;

        System.out.println("Digite o seu saldo médio: ");
        saldoMedio = scanner.nextDouble();

        if (saldoMedio <= 2) {
            credito = 0;
        } else if (saldoMedio > 200 && saldoMedio <= 400) {
            credito = saldoMedio * 0.1;
        } else {
            credito = saldoMedio * 0.2;
        }

        System.out.printf("O saldo médio é de: %.2f\n", saldoMedio);
        System.out.printf("O crédito é de: %.2f", credito);

        scanner.close();
    }
}
