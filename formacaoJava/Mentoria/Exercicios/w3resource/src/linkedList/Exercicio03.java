package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Exercicio03 {
    public static void main(String[] args) {

        // Escreva um programa Java para iterar por meio de todos os elementos
        // em uma lista encadeada começando na posição especificada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1: " + lista1);

        // Setando o Iterator para uma determinado índice
        Iterator itr = lista1.listIterator(2);

        // Exibindo iteração a partir do índice previamente definido
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
