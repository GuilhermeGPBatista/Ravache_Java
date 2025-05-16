public class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        No noA = new No("A");
        No noB = new No("B");
        No noC = new No("C");
        No noD = new No("D");
        No noE = new No("E");
        No noF = new No("F");

        noA.esquerdo = noB;
        noA.direito = noC;

        noB.esquerdo = noD;
        noB.direito = noE;

        noC.direito = noF;

        this.raiz = noA;
    }

    // Percurso em pré-ordem (visita raiz -> esquerda -> direita)
    public void preOrdem(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            preOrdem(no.esquerdo);
            preOrdem(no.direito);
        }
    }
}
