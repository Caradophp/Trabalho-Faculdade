package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int num01 = 0, num02 = 0;
        double resultado = 0;

        System.out.println("Digite o primeiro número: ");
        num01 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        num02 = scanner.nextInt();

        System.out.println("""
                Selecione uma opção:
                1 - Adição
                2 - Subtração
                3 - Multiplicação
                4 - Divisão
                """);
        
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                resultado = num01 + num02;
                break;
            case 2:
                resultado = num01 - num02;
                break;
            case 3:
                resultado = num01 * num02;
                break;
            case 4:
                if (num02 != 0) {
                    resultado = num01 / num02;
                } else {
                    System.out.println("Não existe divisão por zero");
                }
                
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        System.out.println("O resultado da operação é " + resultado);

        scanner.close();

    }
}
