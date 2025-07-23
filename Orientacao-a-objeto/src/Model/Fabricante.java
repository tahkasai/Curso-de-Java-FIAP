package Model;

public class Fabricante {
    private String nome;
    private String endereco;

    public Fabricante(String nome, String endereco){
        this.endereco = endereco;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome + ", " + endereco;
    }
}

