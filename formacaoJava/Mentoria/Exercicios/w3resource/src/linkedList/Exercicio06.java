package linkedList;

import java.util.LinkedList;

public class Exercicio06 {
    public static void main(String[] args) {

        // Escreva um programa Java para inserir elementos
        // na lista encadeada na primeira e na última posição

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Adicionando elemento ao começo da lista
        lista1.addFirst("Branca");

        // Adicionando elemento ao final da lista
        lista1.addLast("Rosa");

        // Exibindo o resultado
        System.out.println("Lista 1 (alterada): " + lista1);

    }
}
