package linkedList;

import java.util.LinkedList;

public class Exercicio09 {
    public static void main(String[] args) {

        // Escreva um programa Java para inserir alguns elementos
        // na posição especificada em uma lista encadeada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Criando uma outra lista e adicionando alguns valores
        LinkedList<String> lista2 = new LinkedList<>();
        lista2.add("Branca");
        lista2.add("Rosa");

        // Adicionando a coleção na segunda posição da lista encadeada existente
        lista1.addAll(1, lista2);

        // Exibindo o resultado
        System.out.println("Lista 1 (alterada): " + lista1);

    }
}
