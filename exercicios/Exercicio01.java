package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerador = 0, denominador = 0;
        double resultado = 0.0;

        do {
            
            System.out.println("Digite o numerador: ");
            numerador = scanner.nextInt();

            System.out.println("Digite o denominador: ");
            denominador = scanner.nextInt();

            if (denominador == 0 ) {
                System.out.println("Divisão indeterminada");
            } else {
                resultado = numerador / denominador;
            }

        } while (denominador == 0);

        System.out.printf("Resultado da divisão: %.2f", resultado);

        scanner.close();
    }

}
