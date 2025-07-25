package br.com.fiap.produtos;

import br.com.fiap.produtos.Model.Categoria;
import br.com.fiap.produtos.Model.Produto;
import br.com.fiap.produtos.Repository.CategoriaCollectionRepository;
import br.com.fiap.produtos.Repository.ProdutoCollectionRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Categoria categoria = new Categoria();
        categoria.setId(1l).setNome("Informatica");

        Categoria categoriaSalva = CategoriaCollectionRepository.save(categoria);

        System.out.println("Categoria: "+categoriaSalva);
        // -----------------------------------------

        // para conseguir atribuir os valores de uma vez, é necessário que na hora de nomear os set, defina-os como builder
        Produto produto = new Produto();
        produto .setNome("Kindle")
                .setDescricao("e-reader")
                .setCategoria(CategoriaCollectionRepository.findByNome("Eletrônicos").get(0))
                .setDataDeCadastro(LocalDateTime.now())
                .setPreco(BigDecimal.valueOf(800))
        ;

        Produto produto1 = ProdutoCollectionRepository.save(produto);

        System.out.println("Id: "+produto1.getId()+"\nnome: "+produto1.getNome());
    }
}