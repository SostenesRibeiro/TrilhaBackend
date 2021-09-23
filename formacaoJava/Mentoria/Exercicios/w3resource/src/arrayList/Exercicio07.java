package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercicio07 {
    public static void main(String[] args) {

        // Escreva um programa Java para pesquisar
        // um elemento em uma lista

        // Criando uma lista e adicionando alguns valores
        List<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista
        System.out.println("Lista 1: " + lista1);

        // Realizando busca por um determinado valor, na lista, e devolvendo o resultado
        String cor = "Azul";
        System.out.println("Buscando pela cor: " + cor);
            if (lista1.contains(cor)) {
                System.out.println("Cor " + cor + " ENCONTRADA!");
            } else {
                System.out.println("Desculpe, cor " + cor + " NÃO ENCONTRADA!!!");
            }

    }
}