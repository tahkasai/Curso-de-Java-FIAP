import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // variável para armazenar a quantidade de alunos
        int quant = 0;

        // variável para armazenar a somatória
        double somaNotas = 0;

        // variável para armazenar a opção do usuário
        int op;

        // Laço de repetição para ler as notas
        do {
            quant++;
            System.out.println("Digite a nota do "+quant+"° aluno: ");
            double nota = leitor.nextDouble();
            if (nota > 10 || nota < 0){
                System.out.println("Nota invalida!");
            } else{
                somaNotas += nota;
            }
            System.out.println("Deseja realizar outra operação? 1-sim ou 2-não");
            op = leitor.nextInt();
        } while(op == 1);

        // Calculando a média
        double media = somaNotas / quant;
        System.out.println("A média da nota dos alunos é: "+media);
        System.out.println("A quantidade de alunos na turma é de "+quant);

/*
        // Ler a quantidade de alunos
        System.out.println("Digite a quantidade de alunos");
        int quantidade = leitor.nextInt();

        double somaNotas = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Digite a nota do "+i+"° aluno: ");
            float nota = leitor.nextFloat();
            if (nota < 0 || nota > 10){
                System.out.println("Nota inválida!");
                i--;
            } else{
                somaNotas += nota;
            }
        }

        // média da turma
        double media = somaNotas / quantidade;
        System.out.println("Média da turma: "+media);
*/
    }
}