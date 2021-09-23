package arrayList;

import java.util.ArrayList;

public class Exercicio16 {
    public static void main(String[] args) {

        // Escreva um programa Java para clonar
        // uma lista a partir de outra

        // Criando uma lista e adicionando alguns valores
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Preta");
        lista1.add("Branca");
        lista1.add("Rosa");

        // Exibindo a lista 1
        System.out.println("Lista 1: " + lista1);

        // Clonando a lista 1 para a lista 2
        ArrayList<String> lista2 = (ArrayList<String>)lista1.clone();

        // Exibindo o resultado
        System.out.println("Lista 2 (clone de lista1): " + lista2);


    }
}
