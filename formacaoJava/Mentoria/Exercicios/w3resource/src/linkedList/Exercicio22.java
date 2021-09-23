package linkedList;

import java.util.LinkedList;

public class Exercicio22 {
    public static void main(String[] args) {

        // Escreva um programa Java para verificar se um
        // determinado elemento existe em uma lista encadeada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        String elementoBuscado;

        // Verificando a existência de um determinado elemento em uma lista
        elementoBuscado = "Verde";
        if (lista1.contains(elementoBuscado)) {
            System.out.println("O elemento: " + elementoBuscado + ", foi encontrado!");
        } else {
            System.out.println("Infelizmente não encontramos o elemento: " + elementoBuscado + "; na lista!");
        }

        // Realizando outra verificação
        elementoBuscado = "Azul";
        if (lista1.contains(elementoBuscado)) {
            System.out.println("O elemento: " + elementoBuscado + ", foi encontrado!");
        } else {
            System.out.println("O elemento: " + elementoBuscado + ", NÃO foi encontrado!");
        }

    }
}
