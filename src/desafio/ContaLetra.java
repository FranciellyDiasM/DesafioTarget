package desafio;

public class ContaLetra {

    public int contaA(String entrada) {
        int contador = 0;

        for (int i = 0; i < entrada.length(); i++) {
            char letra = entrada.charAt(i);
            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        return contador;
    }
}
