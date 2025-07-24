package Exemplo2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){

        // realizando comparações entre datas
        LocalDate nascimento = LocalDate.of(2005,9,26);
        LocalDate hoje = LocalDate.now();

        // Saber se é igual, antes ou depois
        System.out.println("Igual: "+nascimento.isEqual(hoje));
        System.out.println("Antes: "+nascimento.isEqual(hoje));
        System.out.println("Depois: "+nascimento.isEqual(hoje));

        // e o periodo decorrido?
        Period periodo = Period.between(nascimento,hoje);

        System.out.println(periodo.getYears()+" Anos "
                + periodo.getMonths() + " meses "
                +  periodo.getDays() + " e dias"
        );

        System.out.println("Período em massa: "+periodo.toTotalMonths());

        // formatando para pt-br

        System.out.println("\nHoje: "
            + LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        );
    }
}
