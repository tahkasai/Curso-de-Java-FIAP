package br.com.fiap.produtos.View;

public enum Opcao {

    CADASTRAR_CATEGORIA(1, "Cadastrar categoria"),
    CADASTRAR_PRODUTO(2, "Cadastrar produto"),
    ALTERAR_PRODUTO(3, "Alterar produto"),
    CONSULTAR_PRODUTO_POR_ID(4, "Consultar produto por ID"),
    CONSULTAR_PRODUTO_POR_CATEGORIA(5, "Consultar produto por categoria"),
    ENCERRAR_SISTEMA(6, "Encerrar sistema");

    int id;
    String nome;

    // construor
    Opcao(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // get e set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // to string
    @Override
    public String toString() {
        return nome.toUpperCase();
    }
}
