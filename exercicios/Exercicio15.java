package exercicios;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora de inicio do jogo: ");
        int horaInicial = scanner.nextInt();

        System.out.println("Digite o minuto de inicio do jogo: ");
        int minutoInicial = scanner.nextInt();

        System.out.println("Digite a hora do fim do jogo: ");
        int horaFinal = scanner.nextInt();

        System.out.println("Digite o minuto do fim do jogo (HH:ss): ");
        int minutoFinal= scanner.nextInt();

        if ((!(horaInicial > 24) && !(minutoInicial > 59)) && (!(horaFinal > 24) && !(minutoFinal > 59))) {

            LocalTime inicio = LocalTime.of(horaInicial, minutoInicial);
            LocalTime fim = LocalTime.of(horaFinal, minutoFinal);

            LocalDate hoje = LocalDate.now();
            LocalDateTime inicioDateTime = LocalDateTime.of(hoje, inicio);
            LocalDateTime fimDateTime = LocalDateTime.of(hoje, fim);

            if (fimDateTime.isBefore(inicioDateTime)) {
                fimDateTime = fimDateTime.plusDays(1);
            }

            Duration duration = Duration.between(inicioDateTime, fimDateTime);

            long horas = duration.toHours();
            long minutos = duration.toMinutesPart();

            System.out.printf("Duração do jogo: %d %s e %d %s",
                    horas, horas != 1 ? "horas" : "hora",
                    minutos, minutos != 1 ? "minutos" : "minuto");
            
        } else {
            System.out.println("Entrada de dados não é válida");
        }

        scanner.close();
    }
}
