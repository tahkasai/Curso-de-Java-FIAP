import Model.CEP;
import Model.Computador;
import Model.Fabricante;

public class Main {
    public static void main(String[] args) {

        // CEP
        CEP cep1 = new CEP("08561-620");
        System.out.println(cep1);

        // Fabricante
        Fabricante fabricante1 = new Fabricante("Lenovo","rua coronel benedito de almeida, 134");
        // Computador
        Computador computador1 = new Computador("Lenovo V14","lenovo",3695.99,16,"Corel i5",true,fabricante1);

        System.out.println(computador1);
    }
}