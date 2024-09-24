import desafio.Fibonacci;
import ui.InOut;


public class Main {
    public static void main(String[] args) {
        fibonacci();
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
}