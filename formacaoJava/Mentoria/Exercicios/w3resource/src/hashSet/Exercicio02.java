package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Exercicio02 {
    public static void main(String[] args) {

        // Escreva um programa Java para iterar por
        // meio de todos os elementos em uma lista hash

        // Criando uma lista e adicionando alguns valores
        HashSet<String> lista1 = new HashSet<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1: " + lista1);

        // Iterando e exibindo a lista
        Iterator<String> itr = lista1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();

        // Outra forma de iteração
        for (String elemento : lista1) {
            System.out.println(elemento);
        }

    }
}
