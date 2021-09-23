package linkedList;

import java.util.LinkedList;

public class Exercicio25 {
    public static void main(String[] args) {

        // Escreva um programa Java para testar se
        // uma lista encadeada está vazia ou não

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Verificando se uma lista está vazia ou não
        System.out.println("A lista1 está vazia?: " + lista1.isEmpty());

        // Removendo TODOS os elementos da lista
        lista1.removeAll(lista1);

        // Exibindo a lista 1
        System.out.println("Lista 1 (alterada): " + lista1);

        // Realizando nova verifição após remoção de todos os elementos da lista
        System.out.println("A lista1 está vazia?: " + lista1.isEmpty());

    }
}
