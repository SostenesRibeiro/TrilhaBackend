package hashSet;

import java.util.HashSet;

public class Exercicio07 {
    public static void main(String[] args) {

        // Escreva um programa Java para converter
        // um conjunto de hash em uma matriz

        // Criando uma lista e adicionando alguns valores
        HashSet<String> lista1 = new HashSet<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Criando um Array
        String [] lista2 = new String[lista1.size()];
        lista1.toArray(lista2);

        // Exibindo o resultado
        System.out.println("Lista 2 (ArrayList): ");
        for (String cor : lista2) {
            System.out.println(cor);
        }

    }
}
