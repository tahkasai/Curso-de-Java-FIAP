// Exemplo de Operador ternário
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número de laranjas: ");
        int numeroLaranjas = leitor.nextInt();

        double valor = numeroLaranjas < 10 ? 2.5 : 2;

        System.out.println("Pagamento por pix? (true ou false) ");
        boolean pix = leitor.nextBoolean();

        double desconto = (pix == true) ? .9 : 1;

        double valorFinal = numeroLaranjas * valor * desconto;
        System.out.println(valorFinal);
    }
}