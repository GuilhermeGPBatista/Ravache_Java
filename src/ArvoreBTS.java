public class ArvoreBTS {
    No raiz;

    // Verifica se um nó é vermelho
    private boolean isRed(No no) {
        return no != null && no.cor == No.Cor.RED;
    }

    // Rotação à esquerda para corrigir violações
    private No rotacionarEsquerda(No no) {
        No x = no.direito;
        no.direito = x.esquerdo;
        x.esquerdo = no;
        x.cor = no.cor; // A cor do novo nó raiz herda a cor do nó original
        no.cor = No.Cor.RED; // O nó rotacionado se torna vermelho
        return x;
    }

    // Rotação à direita para corrigir violações
    private No rotacionarDireita(No no) {
        No x = no.esquerdo;
        no.esquerdo = x.direito;
        x.direito = no;
        x.cor = no.cor; // A cor do novo nó raiz herda a cor do nó original
        no.cor = No.Cor.RED; // O nó rotacionado se torna vermelho
        return x;
    }

    // Alterna as cores de um nó e seus filhos
    private void flipColors(No no) {
        no.cor = No.Cor.RED; // O nó atual se torna vermelho
        if (no.esquerdo != null) no.esquerdo.cor = No.Cor.BLACK; // Os filhos se tornam pretos
        if (no.direito != null) no.direito.cor = No.Cor.BLACK; // Os filhos se tornam pretos
    }

    // Insere um novo nó na árvore
    private No inserir(No no, int chave) {
        if (no == null) {
            return new No(chave); // Nós novos são vermelhos por padrão
        }

        if (chave < no.chave) {
            no.esquerdo = inserir(no.esquerdo, chave); // Insere na subárvore esquerda
        } else if (chave > no.chave) {
            no.direito = inserir(no.direito, chave); // Insere na subárvore direita
        }

        // Corrige violações das propriedades da árvore rubro-negra
        if (isRed(no.direito) && !isRed(no.esquerdo)) {
            no = rotacionarEsquerda(no);
        }
        if (isRed(no.esquerdo) && isRed(no.esquerdo.esquerdo)) {
            no = rotacionarDireita(no);
        }
        if (isRed(no.esquerdo) && isRed(no.direito)) {
            flipColors(no);
        }

        return no;
    }

    //metodo pra inserir um no
    public void inserir(int chave) {
        raiz = inserir(raiz, chave);
        raiz.cor = No.Cor.BLACK; // A raiz da árvore é sempre preta
    }
}

