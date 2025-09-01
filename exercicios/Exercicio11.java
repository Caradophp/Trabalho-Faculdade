package exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias = 0, mes = 0, ano = 0;
        boolean isBissexto = false;

        System.out.println("Selecione um mês de 1 à 12: ");
        mes = scanner.nextInt();

        System.out.println("Digite um ano: ");
        ano = scanner.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            isBissexto = true;
        }

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2: 
                if (isBissexto) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
        
            default:
                System.out.println("Opções inválida");
                break;
        }

        System.out.printf("Esse mês tem %d dias e %s", dias, isBissexto ? "é bissexto" : "não é bissexto");

        scanner.close();
    }
}
