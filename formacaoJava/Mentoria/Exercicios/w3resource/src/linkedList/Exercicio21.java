package linkedList;

import java.util.LinkedList;

public class Exercicio21 {
    public static void main(String[] args) {

        // Escreva um programa Java para recuperar, mas não
        // remover, o último elemento de uma lista encadeada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Recuperando o primeiro elemento da lista
        String ultimoElemento = lista1.peekLast();
        System.out.println("O último elemento da lista é: " + ultimoElemento);

        // Exibindo a lista sem qualquer alteração
        System.out.println("Lista 1 (original): " + lista1);

    }
}
