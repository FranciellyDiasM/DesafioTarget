package test;

import desafio.ContaLetra;
import desafio.Fibonacci;

public class MainTeste {
    public static void main(String[] args) {

        System.out.println("-- Testes Fibonacci--");
        testarFibonacci();
        System.out.println("\n\n -- Testes Conta Letras--");
        testarContaLetra();
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

    public static void testarContaLetra() {
        ContaLetra subject = new ContaLetra();

        // Testes com diferentes strings
        testar(subject.contaA("abracadabra"), 5, "Contar 'a' em 'abracadabra'");
        testar(subject.contaA("banana"), 3, "Contar 'a' em 'banana'");
        testar(subject.contaA("cachorro"), 1, "Contar 'a' em 'cachorro'");
        testar(subject.contaA("hello world"), 0, "Contar 'a' em 'hello world'");
        testar(subject.contaA("Aloha"), 2, "Contar 'a' em 'Aloha'");
        testar(subject.contaA(""), 0, "Contar 'a' em string vazia");
        testar(subject.contaA("AaAaAa"), 6, "Contar 'a' em 'AaAaAa'");
        testar(subject.contaA("Teste sem"), 0, "Contar 'a' em 'Teste sem'");
    }

    public static void testar(Object valor, Object esperado, String nomeTeste) {
        if (valor == esperado) {
            System.out.println("PASSOU para " + nomeTeste);
        } else {
            System.out.println("X FALHOU para " + nomeTeste + ":  (esperado: " + esperado + " e encontro: " + valor + ")");
        }
    }
}
