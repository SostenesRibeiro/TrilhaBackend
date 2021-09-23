package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercicio23 {
    public static void main(String[] args) {

        // Escreva um programa Java para converter
        // uma lista encadeada em uma lista de matrizes

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Convertendo uma lista encadeada em uma lista de matrizes
        List<String> lista2 = new ArrayList<>(lista1);

        // Exibindo a lista sem qualquer alteração
        System.out.println("Lista 2 (matriz): " + lista2);

    }
}
