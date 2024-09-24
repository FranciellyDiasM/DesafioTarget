package desafio;

public enum SequenciaEnum {
    IMPARES(
            "1, 3, 5, 7, _",
            9,
            "Sequência de números ímpares"
    ),

    POTENCIA_BASE_DOIS(
            "2, 4, 8, 16, 32, 64, _",
            128,
            "Potencia na base dois(2 elevado a 1, a 2, a 3...)"
    ),

    SEQUENCIA_AO_QUADRADO(
            "0, 1, 4, 9, 16, 25, 36, _",
            49,
            "Números ao quadrado(0, 1, 2, 3...)"
    ),

    PARES_AO_QUADRADO(
            "4, 16, 36, 64, _",
            100,
            "Números ao quadrado(2, 4, 6, 8...)"
    )

    ,

    FIBONACCI(
            "1, 1, 2, 3, 5, 8, _",
            13,
            "Números na sequência de fibonacci"
    ),

    INICIA_COM_D(
            "2, 10, 12, 16, 17, 18, 19, _",
            200,
            "Números que começam com a Letra D"
    );

    private final String sequencia;
    private final int valor;
    private final String descricao;

    SequenciaEnum(String sequencia, int valor, String descricao) {
        this.sequencia = sequencia;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getSequencia() {
        return sequencia;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return sequencia;
    }
}
