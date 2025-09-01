package exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;

        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é o primeiro número: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é o segundo número: " + num2);
        } else {
            System.out.println("O maior número é o terceiro número " + num3);
        }

        scanner.close();

    }
}
