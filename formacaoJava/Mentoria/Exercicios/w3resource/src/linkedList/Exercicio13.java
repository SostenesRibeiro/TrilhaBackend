package linkedList;

import java.util.LinkedList;

public class Exercicio13 {
    public static void main(String[] args) {

        // Escreva um programa Java para remover o primeiro
        // e o último elemento de uma lista encadeada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Rosa");
        lista1.add("Laranja");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Removendo o primeiro e último elementos da lista
        Object primeiroElemento = lista1.removeFirst();
        Object ultimoElemento = lista1.removeLast();
        System.out.println("Primeiro elemento removido: " + primeiroElemento);
        System.out.println("Último elemento removido: " + ultimoElemento);

        // Exibindo o resultado
        System.out.println("Lista 1 (alterada): " + lista1);

    }
}
