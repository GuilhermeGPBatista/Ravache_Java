public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.ArvoreExemplo();

        int totalNos = arvore.contarNos();
        System.out.println("Total de nós na árvore: " + totalNos);

        System.out.print("Percurso em pré-ordem: ");
        arvore.percorrerPreOrdem();

        System.out.print("\nPercurso em ordem: ");
        arvore.percorrerEmOrdem();

        System.out.print("\nPercurso em pós-ordem: ");
        arvore.percorrerPosOrdem();

        System.out.print("\nPercurso em nível: ");
        arvore.percorrerEmNivel();
    }
}


