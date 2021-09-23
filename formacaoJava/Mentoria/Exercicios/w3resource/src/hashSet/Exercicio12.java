package hashSet;

import java.util.HashSet;

public class Exercicio12 {
    public static void main(String[] args) {

        // Escreva um programa Java para remover
        // todos os elementos de um conjunto hash

        // Criando uma lista e adicionando alguns valores
        HashSet<String> lista1 = new HashSet<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Removendo TODOS os elementos da lista
        lista1.clear();

        // Exibindo o resultado
        System.out.println("Lista 1 (deletada): " + lista1);
    }
}
