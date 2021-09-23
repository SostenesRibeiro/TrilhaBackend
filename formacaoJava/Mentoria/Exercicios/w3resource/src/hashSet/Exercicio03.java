package hashSet;

import java.util.HashSet;

public class Exercicio03 {
    public static void main(String[] args) {

        // Escreva um programa Java para obter o
        // número de elementos em um conjunto hash

        // Criando uma lista e adicionando alguns valores
        HashSet<String> lista1 = new HashSet<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1: " + lista1);

        // Obtendo o número de elementos de uma lista hash
        System.out.println("O total de elementos da lista1 é: " + lista1.size());

    }
}
