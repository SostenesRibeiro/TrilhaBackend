package arrayList;

import java.util.ArrayList;

public class Exercicio19 {
    public static void main(String[] args) {

        // Escreva um programa Java para reduzir a
        // capacidade de uma lista do tamanho da lista atual

        // Criando uma lista e adicionando alguns valores
        ArrayList<String> lista1 = new ArrayList<>(10);
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // "Podando" a lista
        lista1.trimToSize();

        // Exibindo a lista 1
        System.out.println("Lista 1 (podada): " + lista1);

    }
}
