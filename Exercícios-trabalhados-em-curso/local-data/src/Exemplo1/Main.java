package Exemplo1;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println("Informações gerais\n");
        System.out.println(localDate);
        System.out.println("Dia da semana (nome): "+localDate.getDayOfWeek());
        System.out.println("Dia da semana (ordinal): "+localDate.getDayOfWeek().ordinal());
        System.out.println("Mês (nome): "+localDate.getMonthValue());
        System.out.println("Mes (ordinal): "+localDate.getMonth().ordinal());
        System.out.println("Ano: "+localDate.getYear());
        System.out.println("Ano bissexto: "+localDate.isLeapYear());
        System.out.println("Número de dias do mês: "+localDate.lengthOfMonth());
        System.out.println("Número de dias do ano: "+localDate.lengthOfYear());

        System.out.println("\nInformações do mês\n");

        System.out.println("Hoje: "+localDate);

        LocalDate ontem = localDate.minusDays(1);
        System.out.println("Ontem: "+ontem);

        LocalDate amanha = localDate.plusDays(1);
        System.out.println("Amanhã: "+amanha);

        LocalDate mesQueVem = localDate.plusMonths(1);
        System.out.println("Mês que vem: "+mesQueVem);

        LocalDate anoQueVem = localDate.plusYears(1);
        System.out.println("Ano que vem: "+anoQueVem);

        LocalDate ultimoDiaMes = localDate.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Ultimo dia deste mês: "+ultimoDiaMes);

        LocalDate ultimoDiaFevereiro = localDate.withMonth(2).with((TemporalAdjusters.lastDayOfMonth()));
        System.out.println("Ultimo dia de fevereiro deste ano: "+ultimoDiaFevereiro);

        LocalDate nascimento = LocalDate.of(2005, Month.SEPTEMBER,26);
        System.out.println("Data de Nascimento: "+nascimento);
    }
}