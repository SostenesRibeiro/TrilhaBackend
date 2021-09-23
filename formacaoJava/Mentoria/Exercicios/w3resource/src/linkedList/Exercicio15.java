package linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Exercicio15 {
    public static void main(String[] args) {

        // Escreva um programa Java de troca de
        // dois elementos em uma lista encadeada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Rosa");
        lista1.add("Laranja");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Trocando os elementos dos índices 0 e 2
        Collections.swap(lista1, 0, 2);

        // Exibindo o resultado
        System.out.println("Lista 1 (alterada): " + lista1);

    }
}
