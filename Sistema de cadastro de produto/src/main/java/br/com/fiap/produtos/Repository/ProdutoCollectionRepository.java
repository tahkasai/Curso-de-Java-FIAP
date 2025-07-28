package br.com.fiap.produtos.Repository;

import br.com.fiap.produtos.Model.Categoria;
import br.com.fiap.produtos.Model.Produto;

import javax.swing.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

public class ProdutoCollectionRepository {
    private static List<Produto> produtos;

    static {
        produtos = new Vector<>();
        Produto celular = new Produto();
        celular.setNome("Iphone 13")
                .setDescricao("Aparelho celular da Apple")
                .setCategoria(CategoriaCollectionRepository.findById(2l))
                .setDataDeCadastro(LocalDateTime.now())
                .setPreco(BigDecimal.valueOf(12000));

        save(celular);
    }

    //Exibir todas as listas
    public  static List<Produto> findAll(){return produtos;}
    
    // Exibir por Id
    public static Categoria findById(Long id){
        return Objects.requireNonNull(produtos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst().orElse(null)).getCategoria();
    }
    // salvar produto
    public static Produto save(Produto produto) {
        if(!produtos.contains(produto)){
            produto.setId((long) produtos.size()+1);
            produtos.add(produto);
            return produto;
        }else{
            JOptionPane.showMessageDialog(null, "Esse produto já está cadastrado");
            return null;
        }
    }

    public static List<Produto> findByCategoria(Categoria categoria) {
        if (categoria == null) return List.of();

        return produtos.stream()
                .filter(p -> categoria.equals(p.getCategoria()))
                .toList();
    }

}
