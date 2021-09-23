package linkedList;

import java.util.LinkedList;

public class Exercicio26 {
    public static void main(String[] args) {

        // Escreva um programa Java para substituir
        // um elemento em uma lista encadeada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Substituindo um valor em um determinado índice da lista
        lista1.set(1, "Laranja");

        // Exibindo o resultado
        System.out.println("Lista 1 (alterada): " + lista1);

    }
}
