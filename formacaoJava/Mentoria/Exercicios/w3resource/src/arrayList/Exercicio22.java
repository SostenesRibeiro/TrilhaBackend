package arrayList;

import java.util.ArrayList;

public class Exercicio22 {
    public static void main(String[] args) {

        // Escreva um programa Java para imprimir todos
        // os elementos de uma lista usando a posição dos elementos

        // Criando uma lista e adicionando alguns valores
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1: " + lista1);

        for (String cor : lista1) {
            System.out.println("Indice: " + lista1.indexOf(cor) + " | Elemento: " + cor);
        }

    }
}
