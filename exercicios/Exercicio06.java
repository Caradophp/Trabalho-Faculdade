package exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo = 0, pesoToneladas = 0, pesoQuilos = 0;
        double precoQuilo = 0.0, precoCarga = 0;

        System.out.println("Digite o código da carga: ");
        codigo = scanner.nextInt();

        System.out.println("Digite o peso da carga (em toneladas): ");
        pesoToneladas = scanner.nextInt();

        if (codigo >= 10 && codigo <= 20) {
            precoQuilo = 100;
        } else if (codigo >= 21 && codigo <=30) {
            precoQuilo = 250;
        } else if (codigo >= 31 && codigo <= 40) {
            precoQuilo = 350;
        } else {
            System.out.println("Código inválido");
        }

        pesoQuilos = pesoToneladas * 1000;
        precoCarga = precoQuilo * pesoQuilos;

        System.out.println("O peso em quilos é de " + pesoQuilos + " Kg");
        System.out.printf("O preço da carga do caminhão é de R$ %.2f", precoCarga);

        scanner.close();
    }
}
