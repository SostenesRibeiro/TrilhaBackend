package linkedList;

import java.util.LinkedList;

public class Exercicio10 {
    public static void main(String[] args) {

        // Escreva um programa Java para obter a primeira e a última
        // ocorrência dos elementos especificados em uma lista encadeada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Rosa");
        lista1.add("Laranja");

        // Exibindo a lista 1
        System.out.println("Lista 1: " + lista1);

        // Buscando o primeiro elemento da lista e exibindo o resultado
        Object primeiroElemento = lista1.getFirst();
        System.out.println("Primeiro elemento (cor): " + primeiroElemento);

        // Buscando o último elemento da lista e exibindo o resultado
        Object ultimoElemento = lista1.getLast();
        System.out.println("Último elemento (cor): " + ultimoElemento);

    }
}
