public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        ArvoreAVL arvoreAVL = new ArvoreAVL();
        ArvoreBTS arvoreRedBlack = new ArvoreBTS();
        arvore.ArvoreExemplo();

        int totalNos = arvore.contarNos();
        System.out.println("Total de nós na árvore: " + totalNos);

        System.out.print("Percurso em pré-ordem (recursivo): ");
        arvore.percorrerPreOrdem();

        System.out.print("\nPercurso em ordem (recursivo): ");
        arvore.percorrerEmOrdem();

        System.out.print("\nPercurso em pós-ordem (recursivo): ");
        arvore.percorrerPosOrdem();

        System.out.print("\nPercurso em nível (recursivo): ");
        arvore.percorrerEmNivel();

        System.out.print("\nPercurso em pré-ordem (iterativo): ");
        arvore.percorrerPreOrdemIterativo();

        System.out.print("\nPercurso em ordem (iterativo): ");
        arvore.percorrerEmOrdemIterativo();

        System.out.print("\nPercurso em pós-ordem (iterativo): ");
        arvore.percorrerPosOrdemIterativo();

        System.out.print("\nPercurso em nível (iterativo): ");
        arvore.percorrerEmNivelIterativo();

        int[] chaves = {10, 20, 30, 40, 50, 25};

        for (int chave : chaves) {
            arvoreAVL.raiz = arvoreAVL.inserir(arvoreAVL.raiz, chave);
        }

        System.out.print("\nPercurso em ordem (AVL): ");
        arvoreAVL.percorrerEmOrdem(arvoreAVL.raiz);

        int[] valores = {10, 20, 30, 15, 5, 25};
        for (int valor : valores) {
            arvoreRedBlack.inserir(valor); // Corrected method call
        }

        System.out.println("Árvore após inserções (in-order): ");
        arvoreRedBlack.inorder(); // Corrected method call

        arvoreRedBlack.delete(10); // Corrected method call
        arvoreRedBlack.delete(10); // Corrected method call

        System.out.println("Árvore após remoções: ");
        arvoreRedBlack.inorder(); // Corrected method call
    }
}



