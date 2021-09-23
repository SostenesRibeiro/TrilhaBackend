package linkedList;

import java.util.LinkedList;

public class Exercicio17 {
    public static void main(String[] args) {

        // Escreva um programa Java para
        // juntar duas listas encadeada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1: " + lista1);

        // Criando uma outra lista e adicionando alguns valores
        LinkedList<String> lista2 = new LinkedList<>();
        lista2.add("Vermelha");
        lista2.add("Verde");
        lista2.add("Preta");
        lista2.add("Rosa");

        // Exibindo a lista 2
        System.out.println("Lista 2: " + lista2);

        // Realizando a junção das duas listas
        LinkedList<String> lista3 = new LinkedList<>();
        lista3.addAll(lista1);
        lista3.addAll(lista2);

        // Exibindo o resultado
        System.out.println("Lista 3: " + lista3);

    }
}
