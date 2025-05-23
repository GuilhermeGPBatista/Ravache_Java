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

    public void percorrerEmOrdem() {
        percorrerEmOrdem(raiz);
    }

    private void percorrerEmOrdem(No no) {
        if (no != null) {
            percorrerEmOrdem(no.esquerdo);
            System.out.print(no.valor + " ");
            percorrerEmOrdem(no.direito);
        }
    }

    public void percorrerPosOrdem() {
        percorrerPosOrdem(raiz);
    }

    private void percorrerPosOrdem(No no) {
        if (no != null) {
            percorrerPosOrdem(no.esquerdo);
            percorrerPosOrdem(no.direito);
            System.out.print(no.valor + " ");
        }
    }

    public void percorrerEmNivel() {
        int altura = altura(raiz);
        for (int i = 1; i <= altura; i++) {
            percorrerNivel(raiz, i);
        }
    }

    private void percorrerNivel(No no, int nivel) {
        if (no == null) {
            return;
        }
        if (nivel == 1) {
            System.out.print(no.valor + " ");
        } else {
            percorrerNivel(no.esquerdo, nivel - 1);
            percorrerNivel(no.direito, nivel - 1);
        }
    }

    private int altura(No no) {
        if (no == null) {
            return 0;
        }
        int altEsquerda = altura(no.esquerdo);
        int altDireita = altura(no.direito);
        return 1 + Math.max(altEsquerda, altDireita);
    }
}



