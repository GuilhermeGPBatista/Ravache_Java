class No {
    String valor;
    int chave, altura;
    No esquerdo, direito;
    Cor cor;

    public enum Cor {
        RED, BLACK
    }

    public No(String valor) {
        this.valor = valor;
        this.chave = 0;
        this.altura = 1;
        this.cor = Cor.BLACK;
        esquerdo = direito = null;
    }

    public No(int chave) {
        this.valor = null;
        this.chave = chave;
        this.altura = 1;
        this.cor = Cor.BLACK;
        esquerdo = direito = null;
    }
}
