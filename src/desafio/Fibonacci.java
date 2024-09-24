package desafio;

public class Fibonacci {

    public boolean pertence(int numero) {
        int num1 = 0;
        int num2 = 1;

        if (numero == num1 || numero == num2) {
            return true;
        }

        while (num2 < numero) {
            int proximo = num1 + num2;
            num1 = num2;
            num2 = proximo;
        }

        return num2 == numero;
    }
}
