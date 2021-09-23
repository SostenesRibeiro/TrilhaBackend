package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio11 {
    public static void main(String[] args) {

        // Escreva um programa Java para inverter
        // a ordem dos elementos em uma lista

        // Criando uma lista e adicionando alguns valores
        List<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista
        System.out.println("Lista 1 (original): " + lista1);

        // Realizando a inversão dos valores da lista
        Collections.reverse(lista1);

        // Exibindo o resultado
        System.out.println("Lista 1 (invertida): " + lista1);

    }
}
