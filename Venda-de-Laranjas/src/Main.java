/**
 * Página inicial do programa - no javaDoc é onde o dev deve colocar as regras de negócios, comentários importantes, para relembrar e facilitar futuros colaboradores do projeto
 *
 * @author tainá
 * @since 1.0
 * @version 1.0
 *
 *  como criar: clicar no menu - Tools - Generete JavaDoc - escolher o diretorio de saida - create
 */
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