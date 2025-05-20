public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.ArvoreExemplo();

        int totalNos = arvore.contarNos();
        System.out.println("Total de nós na árvore: " + totalNos);
    }
}



