package linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Exercicio04 {
    public static void main(String[] args) {

        // Escreva um programa Java para iterar
        // uma lista encadeada na ordem reversa

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1: " + lista1);

        // Setando o Iterator para seguir uma ordem inversa
        Iterator itr = lista1.descendingIterator();

        // Exibindo iteração reversa
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
