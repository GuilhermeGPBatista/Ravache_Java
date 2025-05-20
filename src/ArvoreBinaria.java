public class ArvoreBinaria {
    No raiz;

    public int contarNos() {
        return contarNos(raiz);
    }

    private int contarNos(No no) {
        if (no == null) {
            return 0;
        }
        return 1 + contarNos(no.esquerdo) + contarNos(no.direito);
    }

    public void ArvoreExemplo() {
        raiz = new No("A");
        raiz.esquerdo = new No("B");
        raiz.direito = new No("C");
        raiz.esquerdo.esquerdo = new No("D");
        raiz.esquerdo.direito = new No("E");
        raiz.direito.direito = new No("F");
    }

    public void percorrerPreOrdem() {
        percorrerPreOrdem(raiz);
    }

    private void percorrerPreOrdem(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            percorrerPreOrdem(no.esquerdo);
            percorrerPreOrdem(no.direito);
        }
    }
}
