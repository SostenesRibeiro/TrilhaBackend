package linkedList;

import java.util.LinkedList;

public class Exercicio07 {
    public static void main(String[] args) {

        // Escreva um programa Java para inserir o elemento
        // especificado na frente de uma lista encadeada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Adicionando elemento a frente da lista
        lista1.offerFirst("Rosa");

        // Exibindo o resultado
        System.out.println("Lista 1 (alterada): " + lista1);

    }
}
