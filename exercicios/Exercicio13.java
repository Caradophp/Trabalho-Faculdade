package exercicios;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtdCobre = 0, qtdAluminio = 0, totalHastes = 0;
        double desconto = 0.0, totalPago = 0.0;

        System.out.println("Digite a quantidade de hastes de cobre: ");
        qtdCobre = scanner.nextInt();

        System.out.println("Digite a quantidade de hastes de alumínio: ");
        qtdAluminio = scanner.nextInt();

        totalHastes = qtdCobre + qtdAluminio;

        if (totalHastes < 5) {
            desconto = 0;
        } else if (totalHastes >= 5 && totalHastes <= 15) {
            desconto = 0.1;
        } else if (totalHastes >= 16 && totalHastes <= 20) {
            desconto = 0.15;
        } else {
            desconto = 0.2;
        }

        totalPago = (qtdAluminio * 4) + (qtdCobre * 2);
        totalPago -= totalPago * desconto;

        System.out.printf("O total paga por %d hastes é de R$ %.2f", totalHastes, totalPago);

        scanner.close();
    }
}
