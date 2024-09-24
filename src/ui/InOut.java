package ui;

import javax.swing.*;

public class InOut {
    public static int leInteiro(String messagem) {
        Integer retorno = null;

        do {
            try {
                String entrada = JOptionPane.showInputDialog(messagem);
                retorno = Integer.parseInt(entrada);

            } catch (NumberFormatException e) {
                InOut.exibeMensagem("Entrada inválida. Por favor, informe um número inteiro.");
            }
        } while (retorno == null);

        return retorno;
    }

    public static String leTexto(String messagem) {
        return JOptionPane.showInputDialog(messagem);
    }

    public static void exibeMensagem(String messagem) {
        JOptionPane.showMessageDialog(null, messagem);
    }

    public static <T> T selecionaOpcao(T[] opcoes, T padrao) {
        JComboBox<T> menuOpcoes = new JComboBox<T>(opcoes);

        int escolha = JOptionPane.showConfirmDialog(null, menuOpcoes, "Escolha uma opção", JOptionPane.DEFAULT_OPTION);

        if (escolha == JOptionPane.OK_OPTION) {
            return (T) menuOpcoes.getSelectedItem() ;
        } else {
            return padrao;
        }
    }

    public static <T> T selecionaOpcao(T[] opcoes) {
        return selecionaOpcao(opcoes, null);
    }
}
