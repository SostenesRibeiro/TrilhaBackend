package hashSet;

import java.util.HashSet;

public class Exercicio11 {
    public static void main(String[] args) {

        // Escreva um programa Java para comparar dois conjuntos
        // e reter elementos que são iguais em ambos os conjuntos

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

        // Criando uma terceira lista contendo os elementos existentes nas duas primeiras
        lista1.retainAll(lista2);
        System.out.println("Lista 1 (elementos iguais): " + lista1);

        HashSet<String> lista3 = new HashSet<>();
//        lista3.add((String)lista1.clone());
//
//        System.out.println(lista3);

    }
}
