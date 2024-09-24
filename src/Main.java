import desafio.AnalisadorDeSequencia;
import desafio.ContaLetra;
import desafio.Fibonacci;
import desafio.Incrementador;
import ui.InOut;


public class Main {
    public static void main(String[] args) {
        String opcaoSelecionada = "";

        String opcaoFibonacci = "Calcular Fibonacci";
        String opcaoContaLetraA = "Contar Letras A";
        String opcaoIncrementar = "Incrementar números";
        String opcaoAnalisarSequencia = "Analisar sequências";
        String opcaoSair = "Sair";
        String[] opcoes = {
                opcaoFibonacci,
                opcaoContaLetraA,
                opcaoIncrementar,
                opcaoAnalisarSequencia,
                opcaoSair
        };

        do {
            opcaoSelecionada = InOut.selecionaOpcao(opcoes, opcaoSair);

            if (opcaoSelecionada.equals(opcaoFibonacci)) {
                fibonacci();
            } else if (opcaoSelecionada.equals(opcaoContaLetraA)) {
                contaLetraA();

            } else if (opcaoSelecionada.equals(opcaoIncrementar)) {
                incrementar();

            } else if (opcaoSelecionada.equals(opcaoAnalisarSequencia)) {
                analisarSequencia();

            } else if (opcaoSelecionada.equals(opcaoSair)) {
                InOut.exibeMensagem("Programa encerrado!");

            } else {
                InOut.exibeMensagem("Opção inválida");
            }
        } while (!opcaoSair.equals(opcaoSelecionada));
    }

    private static void fibonacci() {
        Fibonacci fibonacci = new Fibonacci();

        int numeroInformado = InOut.leInteiro("Informe um número: ");

        boolean pertence = fibonacci.pertence(numeroInformado);

        if (pertence) {
            InOut.exibeMensagem("O número " + numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            InOut.exibeMensagem("O número " + numeroInformado + " não pertence à sequência de Fibonacci.");
        }
    }

    private static void contaLetraA() {
        ContaLetra contaLetra = new ContaLetra();

        String textoInformado = InOut.leTexto("Informe um texto: ");

        int quantidadeA = contaLetra.contaA(textoInformado);

        if (quantidadeA > 0) {
            InOut.exibeMensagem("Possui Letra A\ntotal: " + quantidadeA);
        } else {
            InOut.exibeMensagem("Não Possui Letra A");
        }

    }

    private static void incrementar() {
        Incrementador incrementador = new Incrementador();

        int indice = InOut.leInteiro("Entre com o valor do indice a ser calculado");

        int soma = incrementador.somarValoresAteLimite(indice);
        InOut.exibeMensagem("O valor da soma é: " + soma);
    }

    private static void analisarSequencia() {
        AnalisadorDeSequencia analisadorDeSequencia = new AnalisadorDeSequencia();

        analisadorDeSequencia.mostrarMenu();
    }
}