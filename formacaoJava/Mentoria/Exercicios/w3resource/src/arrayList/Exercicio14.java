package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercicio14 {
    public static void main(String[] args) {

        // Escreva um programa Java para troca
        // dentre dois elementos em uma lista

        // Criando uma lista e adicionando alguns valores
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo lista ANTES da troca de posições
        System.out.println("Lista 1 (original): " + lista1);

        // Realizando a troca dos valores dos índices 0 e 2
        Collections.swap(lista1, 0, 2);

        // Exibindo lista DEPOIS da troca de posições
        System.out.println("Lista 1 (trocada): " + lista1);

    }
}
