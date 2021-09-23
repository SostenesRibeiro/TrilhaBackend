package linkedList;

import java.util.LinkedList;

public class Exercicio19 {
    public static void main(String[] args) {

        // Escreva um programa Java para remover e retornar
        // o primeiro elemento de uma lista encadeada

        // Criando uma lista e adicionando alguns valores
        LinkedList<String> lista1 = new LinkedList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Removendo e retornando o primeiro elemento da lista
        System.out.println("O elemento removido, foi: " + lista1.pop());
        System.out.println("Lista 1 (alterada): " + lista1);

        // Outra forma de realizar o mesmo procedimento acima
        String elementoRemovido = lista1.remove(0);
        System.out.println("O elemento removido, foi: " + elementoRemovido);

        // Exibindo o resultado
        System.out.println("Lista 1 (alterada): " + lista1);

    }
}
