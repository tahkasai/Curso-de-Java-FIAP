import java.time.*;

public class Main {
    public static void main(String[] args) {

        LocalDateTime inicio = LocalDateTime.of(LocalDate.of(2025, Month.JULY, 24), LocalTime.of(19,24,28));

        LocalDateTime fim = LocalDateTime.of(LocalDate.of(2025, Month.JULY,25),LocalTime.of(6,18,11));

        // Tempo percorrido
        Duration duracao = Duration.between(inicio,fim);

        System.out.println("Horas trabalhadas: "+ duracao.toHoursPart());
        System.out.println("Minutos trabalhados: "+ duracao.toMinutesPart());

        String tempoTotal = String.format("%02d:%02d",duracao.toHoursPart(), duracao.toMinutesPart());

        System.out.println(tempoTotal);
    }
}