package exercicios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sexo = "";
        int idade = 0, maiorIdade = 0;

        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o sexo: ");
        sexo = scanner.nextLine();

        if (sexo.equalsIgnoreCase("masculino")) {
            maiorIdade = 21;
        } else if (sexo.equalsIgnoreCase("feminino")) {
            maiorIdade = 18;
        } else {
            System.out.println("Opção inválida");
        }

        if (idade >= maiorIdade) {
            System.out.println("Maior idade");
        } else {
            System.out.println("Menor idade");
        }

        scanner.close();

    }
}
