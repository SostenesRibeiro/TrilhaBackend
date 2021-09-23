package linkedList;

import java.util.LinkedList;

public class Exercicio18 {
    public static void main(String[] args) {

        // Escreva um programa Java para clonar uma
        // lista vinculada para outra lista encadeada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Clonando a lista1 para uma nova lista
        LinkedList<String> lista2 = new LinkedList<>();
        lista2 = (LinkedList)lista1.clone();

        // Exibindo o resultado
        System.out.println("Lista 2 (clonada): " + lista2);

    }
}
