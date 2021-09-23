package linkedList;

import java.util.LinkedList;

public class Exercicio11 {
    public static void main(String[] args) {

        // Escreva um programa Java para exibir os elementos
        // e suas posições em uma lista encadeada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Rosa");
        lista1.add("Laranja");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Iterando a lista exibindo seus elementos e índices correspondentes
        for (int i=0; i < lista1.size(); i++) {
            System.out.println("Elemento (cor) no índice: " + i + " - " +lista1.get(i));
        }

        // Outra forma com a mesma iteração acima
        System.out.println();
        for (String cor : lista1) {
            System.out.println("Elemento (cor) no índice: " + lista1.indexOf(cor) + " - " + cor);
        }

    }
}
