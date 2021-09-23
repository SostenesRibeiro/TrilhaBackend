package hashSet;

import java.util.HashSet;

public class Exercicio06 {
    public static void main(String[] args) {

        // Escreva um programa Java para clonar um
        // conjunto de hash para outro conjunto de hash

        // Criando uma lista e adicionando alguns valores
        HashSet<String> lista1 = new HashSet<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Clonando uma lista para uma outra
        HashSet<String> lista2 = (HashSet<String>)lista1.clone();

        // Exibindo o resultado
        System.out.println("Lista 2 (clonada): " + lista2);

    }
}
