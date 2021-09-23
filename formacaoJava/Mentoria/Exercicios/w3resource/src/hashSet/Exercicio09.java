package hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercicio09 {
    public static void main(String[] args) {

        // Escreva um programa Java para converter
        // um conjunto de hash em uma List / ArrayList

        // Criando uma lista e adicionando alguns valores
        HashSet<String> lista1 = new HashSet<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Criando uma List a partir de uma Hash
        List<String> lista2 = new ArrayList<>(lista1);

        // Exibindo o resultado
        System.out.println("Lista 2 (List/ArrayList): " + lista2);

    }
}
