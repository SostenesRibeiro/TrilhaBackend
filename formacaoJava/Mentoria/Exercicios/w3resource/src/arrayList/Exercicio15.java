package arrayList;

import java.util.ArrayList;

public class Exercicio15 {
    public static void main(String[] args) {

        // Escreva um programa Java
        // para juntar duas listas

        // Criando uma lista e adicionando alguns valores
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1: " + lista1);

        // Criando outra lista e adicionando alguns valores
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Vermelha");
        lista2.add("Verde");
        lista2.add("Preta");
        lista2.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 2: " + lista2);

        // Criando uma nova lista e adicionando os valores das duas primeiras
        ArrayList<String> lista3 = new ArrayList<>();
        lista3.addAll(lista1);
        lista3.addAll(lista2);

        // Exibindo lista DEPOIS de adicionada as duas primeira listas
        System.out.println("Lista 3 (soma das duas listas): " + lista3);
    }
}
