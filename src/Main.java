public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        System.out.print("Percurso pré-ordem: ");
        arvore.preOrdem(arvore.raiz);
    }
}


