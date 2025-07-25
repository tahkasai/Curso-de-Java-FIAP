package br.com.fiap.produtos.Model;

import java.util.Objects;

public class Categoria {
    private Long id;
    private String nome;

    // Construtor
    public Categoria(){
    }
    public Categoria(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public Categoria(String nome) {
        this.nome = nome;
    }

    // Get e Set
    public Long getId() {
        return id;
    }

    public Categoria setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Categoria setNome(String nome) {
        this.nome = nome;
        return this;
    }

    // equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(nome, categoria.nome);
    }
    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    //toString
    @Override
    public String toString() {
        return nome.toUpperCase();
    }

}
