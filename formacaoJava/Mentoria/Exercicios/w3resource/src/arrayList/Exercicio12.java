package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercicio12 {
    public static void main(String[] args) {

        // Escreva um programa Java para extrair
        // uma parte de uma lista

        // Criando uma lista e adicionando alguns valores
        List<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista
        System.out.println("Lista 1: " + lista1);

        // Criando uma sublista, com os três primeiros valores, a partir da lista 1
        List<String> subLista = lista1.subList(0 , 3);

        // Exibindo o resultado
        System.out.println("Sublista: " + subLista);

    }
}
