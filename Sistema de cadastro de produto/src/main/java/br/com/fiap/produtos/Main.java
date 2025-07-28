
import br.com.fiap.produtos.Model.Categoria;
import br.com.fiap.produtos.Model.Produto;
import br.com.fiap.produtos.Repository.CategoriaCollectionRepository;
import br.com.fiap.produtos.Repository.ProdutoCollectionRepository;
import br.com.fiap.produtos.View.CategoriaView;
import br.com.fiap.produtos.View.Opcao;
import br.com.fiap.produtos.View.OpcaoView;
import br.com.fiap.produtos.View.ProdutoView;

import javax.swing.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Categoria> categorias = CategoriaCollectionRepository.findAll();

        Opcao opcao = null;

        do {
            opcao = OpcaoView.select();
            switch (opcao) {
                case CADASTRAR_CATEGORIA -> cadastrarCategoria();
                case CADASTRAR_PRODUTO -> cadastrarproduto();
                case ALTERAR_PRODUTO -> alterarproduto();
                case CONSULTAR_PRODUTO_POR_ID -> consultarprodutoporid();
                case CONSULTAR_PRODUTO_POR_CATEGORIA -> consultarprodutoporcategoria();
            }
        } while (opcao != Opcao.ENCERRAR_SISTEMA);
    }

    private static void consultarprodutoporcategoria() {
        Categoria categoria = CategoriaView.select(null);
        List<Produto> produtos = ProdutoCollectionRepository.findByCategoria(categoria);
        if (produtos.size() == 0)
            JOptionPane.showMessageDialog(null, "Não encontramos produtos cadastrados para a categoria " + categoria.getNome());
        produtos.forEach(System.out::println);
        produtos.forEach(ProdutoView::show);
    }

    private static void consultarprodutoporid() {
        Long id = 0l;
        do {
            try {
                id = Long.parseLong(JOptionPane.showInputDialog("Informe o id do produto"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Id inválido!");
            }
        } while (id <= 0);

        Categoria p = ProdutoCollectionRepository.findById(id);
        if (p != null) {
            ProdutoView.show(p);
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
        }
    }

    private static void alterarproduto() {

        Produto produto = ProdutoView.select();
        ProdutoView.update(produto);
    }

    private static void cadastrarproduto() {

        Produto produto = ProdutoView.form();
        ProdutoCollectionRepository.save(produto);
        ProdutoView.sucesso(produto);
    }

    public static void cadastrarCategoria() {
        CategoriaView view = new CategoriaView();
        Categoria categoria = view.form();
        CategoriaCollectionRepository.save(categoria);
        view.sucesso(categoria);
    }
}