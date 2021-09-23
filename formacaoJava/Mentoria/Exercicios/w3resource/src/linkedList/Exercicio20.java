package linkedList;

import java.util.LinkedList;

public class Exercicio20 {
    public static void main(String[] args) {

        // Escreva um programa Java para recuperar, mas não
        // remover, o primeiro elemento de uma lista encadeada

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
        String primeiroElemento = lista1.peekFirst();
        System.out.println("O primeiro elemento da lista é: " + primeiroElemento);

        // Exibindo a lista sem qualquer alteração
        System.out.println("Lista 1 (original): " + lista1);

    }
}
