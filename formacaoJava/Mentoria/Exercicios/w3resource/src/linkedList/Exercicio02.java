package linkedList;

import java.util.LinkedList;

public class Exercicio02 {
    public static void main(String[] args) {

        // Escreva um programa Java para iterar por meio
        // de todos os elementos em uma lista encadeada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Iterando e exibindo a lista
        for (String elemento : lista1) {
            System.out.println(elemento);
        }

    }
}
