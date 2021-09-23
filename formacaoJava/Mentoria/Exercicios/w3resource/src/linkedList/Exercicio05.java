package linkedList;

import java.util.LinkedList;

public class Exercicio05 {
    public static void main(String[] args) {

        // Escreva um programa Java para inserir o elemento
        // especificado em uma posição especificada na lista encadeada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1: " + lista1);

        // Adicionando novo elemento na posição de índice 2, da lista
        lista1.add(1, "Amarela");

        // Exibindo o resultado
        System.out.println("Lista 1: " + lista1);

    }
}
