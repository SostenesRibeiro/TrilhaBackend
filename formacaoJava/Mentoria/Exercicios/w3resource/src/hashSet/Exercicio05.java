package hashSet;

import java.util.HashSet;

public class Exercicio05 {
    public static void main(String[] args) {

        // Escreva um programa Java para testar
        // se um conjunto de hash está vazio ou não

        // Criando uma lista e adicionando alguns valores
        HashSet<String> lista1 = new HashSet<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Verificando se a lista está vazia ou não
        System.out.println("A lista está vazia? " + lista1.isEmpty());

        // Removendo TODOS os elementos da lista
        lista1.removeAll(lista1);

        // Exibindo a lista 1
        System.out.println("Lista 1 (alterada): " + lista1);

        // Realizando nova verificação
        System.out.println("A lista está vazia? " + lista1.isEmpty());

    }
}
