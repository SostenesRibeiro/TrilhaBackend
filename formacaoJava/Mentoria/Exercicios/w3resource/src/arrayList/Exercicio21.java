package arrayList;

import java.util.ArrayList;

public class Exercicio21 {
    public static void main(String[] args) {

        // Escreva um programa Java para substituir o segundo
        // elemento de uma lista por um elemento especificado

        // Criando uma lista e adicionando alguns valores
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Substituindo o segundo elemento
        String cor = "Amarela";
        lista1.set(1, cor);

        // Exibindo a lista 1
        System.out.println("Lista 1 (alterada): " + lista1);

    }
}
