import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.print("Digite seu nome completo: ");
            String nomeCompleto = leitor.nextLine();

            if (nomeCompleto.indexOf(" ") == -1) {
                System.out.println("Seu nome está incompleto");
            } else {
                System.lineSeparator();
                System.out.println("Nome completo: " + nomeCompleto);

                // Tamanho da string
                int qtd = nomeCompleto.length();
                System.out.println("Quantidade de Caracteres: " + qtd);

                // Exibir cada parte do nome separadamente
                String nome = nomeCompleto;
                System.lineSeparator();
                System.out.println("Partes do nome:");
                while (nome.indexOf(" ") != -1) {
                    String parte = nome.substring(0, nome.indexOf(" "));
                    nome = nome.substring(nome.indexOf(" ") + 1);
                    System.out.println(parte);
                }

                // Imprimir a última parte restante (último nome)
                System.out.println(nome);
                break;
            }
        }
    }
}
