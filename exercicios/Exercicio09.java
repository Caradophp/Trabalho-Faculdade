package exercicios;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String nomeUm = "", nomeDois  = "", nomeMaisNovo = "";
        int anoMaisNovo = 0, idadeUm = 0, idadeDois = 0, idadeMaisNovo = 0;
        int anoAtual = OffsetDateTime.now().getYear();

        System.out.println("Digite o nome da primeira pessoa: ");
        nomeUm = scanner.nextLine();

        System.out.println("Digite a idade da primeiro pessoa");
        idadeUm = scanner.nextInt();

        scanner.nextLine(); // <- consome o Enter que sobrou para que não seja consumido peno NextLine que receberá o nome da segunda pessoa

        System.out.println("Digite o nome da segunda pessoa: ");
        nomeDois = scanner.nextLine();

        System.out.println("Digite a idade da segunda pessoa");
        idadeDois = scanner.nextInt();

        if (idadeUm > idadeDois) {
            nomeMaisNovo = nomeDois;
            idadeMaisNovo = idadeDois;
        } else if (idadeUm < idadeDois) {
            nomeMaisNovo = nomeUm;
            idadeMaisNovo = idadeUm;
        } else {
            System.out.println("As duas pessoas possuem a mesma idade");
            scanner.close();
            return;
        }

        anoMaisNovo = anoAtual - idadeMaisNovo;

        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);
        System.out.println("Nascida no ano de: " + anoMaisNovo);

        scanner.close();

    }
}
