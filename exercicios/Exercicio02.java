package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Digite um número inteiro: ");
        num = scanner.nextInt();

        if (num % 2 == 0 && num != 0) {
            System.out.println("O número " + num + " é par.");
        } else if (num % 2 != 0) {
            System.out.println("O número " + num + " é ímpar.");
        } else {
            System.out.println("O valor é zero");
        }

        scanner .close();
    }
}
