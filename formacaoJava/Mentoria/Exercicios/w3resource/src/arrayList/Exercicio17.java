package arrayList;

import java.util.ArrayList;

public class Exercicio17 {
    public static void main(String[] args) {

        // Escreva um programa Java
        // para esvaziar uma lista

        // Criando uma lista e adicionando alguns valores
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1: " + lista1);

        // Removendo TODOS os valores da lista 1
        lista1.removeAll(lista1);

        // Exibindo o resultado
        System.out.println("Lista 1: " + lista1);

    }
}
