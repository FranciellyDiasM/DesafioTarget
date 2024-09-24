package test;

import desafio.Fibonacci;

public class MainTeste {
    public static void main(String[] args) {
        testarFibonacci();
    }

    public static void testarFibonacci() {
        Fibonacci subject = new Fibonacci();

        testar(subject.pertence(0), true, "Valida 0");
        testar(subject.pertence(1), true, "Valida 1");
        testar(subject.pertence(2), true, "Valida 2");
        testar(subject.pertence(3), true, "Valida 3");
        testar(subject.pertence(4), false, "Valida 4");
        testar(subject.pertence(5), true, "Valida 5");
        testar(subject.pertence(6), false, "Valida 6");
        testar(subject.pertence(8), true, "Valida 8");
        testar(subject.pertence(13), true, "Valida 13");
        testar(subject.pertence(21), true, "Valida 21");
        testar(subject.pertence(34), true, "Valida 34");
        testar(subject.pertence(35), false, "Valida 35");
    }

    public static void testar(Object valor, Object esperado, String nomeTeste) {
        if (valor == esperado) {
            System.out.println("PASSOU para " + nomeTeste);
        } else {
            System.out.println("X FALHOU para " + nomeTeste + ":  (esperado: " + esperado + " e encontro: " + valor + ")");
        }
    }
}
