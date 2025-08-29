package exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempoCarroUm = 0, tempoCarroDois = 0, distanciaCarroUm = 0, distanciaCarroDois = 0;
        double velocidadeMediaCarroUm = 0.0, velocidadeMediaCarroDois = 0.0;

        System.out.println("Digite o distâcia percorrida pelo primeiro carro ( em km ): ");
        distanciaCarroUm = scanner.nextInt();

        System.out.println("Digite o tempo gasto pelo primeiro carro (em horas)");
        tempoCarroUm = scanner.nextInt();

        System.out.println("Digite o distâcia percorrida pelo segundo carro ( em km ): ");
        distanciaCarroDois = scanner.nextInt();
        
        System.out.println("Digite o tempo gasto pelo primeiro carro ( em horas )");
        tempoCarroDois = scanner.nextInt();

        velocidadeMediaCarroUm = distanciaCarroUm / tempoCarroUm;
        velocidadeMediaCarroDois = distanciaCarroDois / tempoCarroDois;

        System.out.printf("Velocidade média do carro 1: %.2f km/h\n", velocidadeMediaCarroUm);
        System.out.printf("Velocidade média do carro 2: %.2f km/h\n", velocidadeMediaCarroDois);

        if (velocidadeMediaCarroUm > velocidadeMediaCarroDois) {
            System.out.println("O carro 01 tem mais velocidade média");
        } else if (velocidadeMediaCarroUm < velocidadeMediaCarroDois) {
            System.out.println("O carro 02 tem mais velocidade média");
        } else {
            System.out.println("As velocidades são iguais");
        }

        scanner.close();

    }
}
