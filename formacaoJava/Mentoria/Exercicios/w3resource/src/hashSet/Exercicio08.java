package hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio08 {
    public static void main(String[] args) {

        // Escreva um programa Java para converter
        // um conjunto hash em um conjunto tree

        // Criando uma lista e adicionando alguns valores
        HashSet<String> lista1 = new HashSet<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Criando uma lista tree a partir de uma lista hash
        Set<String> lista2 = new TreeSet<>(lista1);

        // Exibindo o resultado
        System.out.println("Lista 2 (Tree): " + lista2);

    }
}
