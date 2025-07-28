package br.com.fiap.produtos.View;

import br.com.fiap.produtos.Model.Categoria;
import br.com.fiap.produtos.Repository.CategoriaCollectionRepository;

import javax.swing.*;

public class CategoriaView {

    static CategoriaCollectionRepository repository;

    public static Categoria select(Categoria categoria){
        //@formatter.off
        Categoria ret = (Categoria) JOptionPane.showInputDialog(
                null,
                "Selecione uma caegoria",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null,
                repository.findAll().toArray(), // número da opção
                categoria == null ? 1 : categoria);
        return ret;
    }

    public void sucesso(){
        JOptionPane.showMessageDialog(null, "Categoria cadastrada com sucesso");
    }

    public void sucesso(Categoria categoria){
        JOptionPane.showMessageDialog(null, "A Categoria "+categoria.getNome()+" foi cadastrada com sucesso");
    }

    public static Categoria form(){
        String nome = JOptionPane.showInputDialog(null, "Informe o nome da categoria");
        return new Categoria(nome);
    }
}
