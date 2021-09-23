package hashSet;

import java.util.HashSet;

public class Exercicio10 {
    public static void main(String[] args) {

        // Escreva um programa Java para
        // comparar dois conjuntos de hash

        // Criando uma lista e adicionando alguns valores
        HashSet<String> lista1 = new HashSet<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Criando uma outra lista e adicionando alguns valores
        HashSet<String> lista2 = new HashSet<>();
        lista2.add("Vermelha");
        lista2.add("Rosa");
        lista2.add("Preta");
        lista2.add("Laranja");

        // Exibindo a lista 2
        System.out.println("Lista 2 (original): " + lista2);

        // Comparando as listas e alimentando uma terceira com os resultados
        HashSet<String> lista3 = new HashSet<>();
        for (String cor : lista1) {
            lista3.add(lista2.contains(cor) ? "Sim" : "Não");
            System.out.println(lista2.contains(cor) ? "Sim" : "Não");
        }

        // Exibindo o resultado
        System.out.println("Lista 3 (resultado): " + lista3);

    }
}
