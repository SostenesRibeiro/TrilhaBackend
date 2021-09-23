package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio08 {
    public static void main(String[] args) {

        // Escreva um programa Java para classificar
        // uma determinada lista

        // Criando uma lista e adicionando alguns valores
        List<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista
        System.out.println("Lista 1 (original): " + lista1);

        // Ordenando a lista
        Collections.sort(lista1);

        // Exibindo o resultado
        System.out.println("Lista 1 (ordenada): " + lista1);

    }
}
