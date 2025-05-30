import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

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

    public int contarNosPilha() {
        if (raiz == null) {
            return 0;
        }

        int count = 0;
        Stack<No> pilha = new Stack<>();
        pilha.push(raiz);

        while (!pilha.isEmpty()) {
            No atual = pilha.pop();
            count++;

            if (atual.direito != null) {
                pilha.push(atual.direito);
            }
            if (atual.esquerdo != null) {
                pilha.push(atual.esquerdo);
            }
        }

        return count;
    }

    public int contarNosFila() {
        if (raiz == null) {
            return 0;
        }

        int count = 0;
        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            count++;

            if (atual.esquerdo != null) {
                fila.add(atual.esquerdo);
            }
            if (atual.direito != null) {
                fila.add(atual.direito);
            }
        }

        return count;
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

    public void percorrerPreOrdemIterativo() {
        if (raiz == null) return;

        Stack<No> pilha = new Stack<>();
        pilha.push(raiz);

        while (!pilha.isEmpty()) {
            No atual = pilha.pop();
            System.out.print(atual.valor + " ");

            if (atual.direito != null) {
                pilha.push(atual.direito);
            }
            if (atual.esquerdo != null) {
                pilha.push(atual.esquerdo);
            }
        }
    }

    public void percorrerEmOrdemIterativo() {
        Stack<No> pilha = new Stack<>();
        No atual = raiz;

        while (atual != null || !pilha.isEmpty()) {
            while (atual != null) {
                pilha.push(atual);
                atual = atual.esquerdo;
            }

            atual = pilha.pop();
            System.out.print(atual.valor + " ");
            atual = atual.direito;
        }
    }

    public void percorrerPosOrdemIterativo() {
        if (raiz == null) return;

        Stack<No> pilha1 = new Stack<>();
        Stack<No> pilha2 = new Stack<>();

        pilha1.push(raiz);
        while (!pilha1.isEmpty()) {
            No atual = pilha1.pop();
            pilha2.push(atual);

            if (atual.esquerdo != null) {
                pilha1.push(atual.esquerdo);
            }
            if (atual.direito != null) {
                pilha1.push(atual.direito);
            }
        }

        while (!pilha2.isEmpty()) {
            System.out.print(pilha2.pop().valor + " ");
        }
    }

    public void percorrerEmNivelIterativo() {
        if (raiz == null) return;

        Queue<No> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.valor + " ");

            if (atual.esquerdo != null) {
                fila.add(atual.esquerdo);
            }
            if (atual.direito != null) {
                fila.add(atual.direito);
            }
        }
    }

    public int contarNosFolhaRecursivo() {
        return contarNosFolhaRecursivo(raiz);
    }

    private int contarNosFolhaRecursivo(No no) {
        if (no == null) {
            return 0;
        }
        if (no.esquerdo == null && no.direito == null) {
            return 1; // It's a leaf node
        }
        return contarNosFolhaRecursivo(no.esquerdo) + contarNosFolhaRecursivo(no.direito);
    }

    public int contarNosFolhaIterativo() {
        if (raiz == null) {
            return 0;
        }

        int count = 0;
        Stack<No> stack = new Stack<>();
        stack.push(raiz);

        while (!stack.isEmpty()) {
            No atual = stack.pop();

            if (atual.esquerdo == null && atual.direito == null) {
                count++;
            }

            if (atual.direito != null) {
                stack.push(atual.direito);
            }
            if (atual.esquerdo != null) {
                stack.push(atual.esquerdo);
            }
        }

        return count;
    }
}



