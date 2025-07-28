package br.com.fiap.produtos.View;

import javax.swing.*;

public class OpcaoView {
    public static Opcao select(){
        Opcao ret = (Opcao) JOptionPane.showInputDialog(
                null, // componene pai. Como não temos será null
                "Selecione uma opção",
                "Menu",
                JOptionPane.QUESTION_MESSAGE,
                null, // icone
                Opcao.values(), // número da opção
                Opcao.CADASTRAR_PRODUTO
        );

        return ret != null ? ret : Opcao.ENCERRAR_SISTEMA; // se o retorno estiver nulo, a opção será encerrar sistema
    }
}
