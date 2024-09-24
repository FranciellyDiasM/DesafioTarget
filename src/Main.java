import desafio.ContaLetra;
import desafio.Fibonacci;
import ui.InOut;


public class Main {
    public static void main(String[] args) {
        String opcaoSelecionada = "";

        String opcaoFibonacci = "Calcular Fibonacci";
        String opcaoContaLetraA = "Contar Letras A";
        String opcaoSair = "Sair";
        String[] opcoes = {opcaoFibonacci, opcaoContaLetraA, opcaoSair};

        do {
            opcaoSelecionada = InOut.selecionaOpcao(opcoes);

            if(opcaoSelecionada.equals(opcaoFibonacci)) {
                fibonacci();
            } else if (opcaoSelecionada.equals(opcaoContaLetraA)) {
                contaLetraA();
            } else if (opcaoSelecionada.equals(opcaoSair)) {
                InOut.exibeMensagem("Programa encerrado!");
            } else {
                InOut.exibeMensagem("Opção inválida");
            }
        } while (!opcaoSelecionada.equals(opcaoSair));
    }

    public static void fibonacci() {
        Fibonacci fibonacci = new Fibonacci();

        int numeroInformado = InOut.leInteiro("Informe um número: ");

        boolean pertence = fibonacci.pertence(numeroInformado);

        if (pertence) {
            InOut.exibeMensagem("O número " + numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            InOut.exibeMensagem("O número " + numeroInformado + " não pertence à sequência de Fibonacci.");
        }
    }

    public static void contaLetraA() {
        ContaLetra contaLetra = new ContaLetra();

        String textoInformado = InOut.leTexto("Informe um texto: ");

        int quantidadeA = contaLetra.contaA(textoInformado);

        if (quantidadeA > 0) {
            InOut.exibeMensagem("Possui Letra A\ntotal: " + quantidadeA);
        } else {
            InOut.exibeMensagem("Não Possui Letra A");
        }

    }
}