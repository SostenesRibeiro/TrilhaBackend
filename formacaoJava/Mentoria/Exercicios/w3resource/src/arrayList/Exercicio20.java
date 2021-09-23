package arrayList;

import java.util.ArrayList;

public class Exercicio20 {
    public static void main(String[] args) {

        // Escreva um programa Java para
        // aumentar o tamanho de uma lista

        // Criando uma lista e adicionando alguns valores
        ArrayList<String> lista1 = new ArrayList<>(3);
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Aumentando a capacidade da lista e adicionando outros valores
        lista1.ensureCapacity(6);
        lista1.add("Branca");
        lista1.add("Rosa");
        lista1.add("Amarela");

        // Exibindo a lista 1
        System.out.println("Lista 1 (alterada): " + lista1);

    }
}
