package linkedList;

import java.util.LinkedList;

public class Exercicio24 {
    public static void main(String[] args) {

        // Escreva um programa Java para
        // comparar duas listas encadeadas

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista2 = new LinkedList<>();
        lista2.add("Vermelha");
        lista2.add("Verde");
        lista2.add("Preta");
        lista2.add("Orange");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista2);

        // Comparando as listas e alimentando uma terceira com os resultados
        LinkedList<String> lista3 = new LinkedList<>();
        for (String cor : lista1) {
            lista3.add(lista2.contains(cor) ? "Sim" : "Não");
        }

        // Exibindo o resultado
        System.out.println("Lista 3 (resultado): " + lista3);

    }
}
