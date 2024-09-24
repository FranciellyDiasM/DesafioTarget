package ui;

import javax.swing.*;

public class InOut {
    public static int leInteiro(String messagem) {
        Integer retorno = null;

        do{
            try {
                String entrada = JOptionPane.showInputDialog(messagem);
                retorno = Integer.parseInt(entrada);

            } catch (NumberFormatException e) {
                InOut.exibeMensagem("Entrada inválida. Por favor, informe um número inteiro.");
            }
        } while (retorno == null);

        return retorno;
    }

    public static void exibeMensagem(String messagem) {
        JOptionPane.showMessageDialog(null, messagem);
    }
}
