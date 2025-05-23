public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
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

        System.out.println();
    }
}



