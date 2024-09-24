package desafio;

public class Incrementador {

    public int somarValoresAteLimite(int limite) {
        int soma = 0;
        int k = 1;

        while (k < limite) {
            k = k + 1;
            soma = soma + k;
        }

        return soma;
    }
}

