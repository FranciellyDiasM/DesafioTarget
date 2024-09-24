package desafio;

import ui.InOut;

/*
    Esta classe é uma abstração visual para responder o questionamentos do desafio 4
 */
public class AnalisadorDeSequencia {


    public void mostrarMenu() {
        SequenciaEnum selecionado = InOut.selecionaOpcao(SequenciaEnum.values());

        if(selecionado != null) {
            InOut.exibeMensagem("A Resposta é %s\n\nmotivo: %s".formatted(
                    selecionado.getValor(),
                    selecionado.getDescricao()
            ));
        }
    }
}