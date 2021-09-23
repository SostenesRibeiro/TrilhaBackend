package arrayList;

import java.util.ArrayList;

public class Exercicio13 {
    public static void main(String[] args) {

        // Escreva um programa Java para comparar duas listas
        // e preencher uma terceira lista com os resultados (SIM ou NÃO)

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

        // Exibindo a lista 2
        System.out.println("Lista 2: " + lista2);

        // Criando uma nova lista e a alimentando com SIM e NÃO a partir da comparação entre as duas primeiras
        ArrayList<String> lista3 = new ArrayList<>();
        for (String cor : lista1) {
            lista3.add(lista2.contains(cor) ? "Sim" : "Não");
        }

        // Exibindo a lista com o resultado
        System.out.println("Lista 3 (resultados): " + lista3);

    }
}
