package arrayList;

import java.util.ArrayList;

public class Exercicio18 {
    public static void main(String[] args) {

        // Escreva um programa Java para testar
        // se uma lista de está vazia ou não

        // Criando uma lista e adicionando alguns valores
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Testando se a lista está vazia
        System.out.println("A lista está vazia? " + lista1.isEmpty());

        // Removendo TODOS os valores da lista 1
        lista1.removeAll(lista1);

        // Exibindo o resultado
        System.out.println("Lista 1 (vazia): " + lista1);

        // Testando novamente se a lista está vazia
        System.out.println("A lista está vazia?: " + lista1.isEmpty());

    }
}
