package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio10 {
    public static void main(String[] args) {

        // Escreva um programa Java para
        // embaralhar elementos em uma lista

        // Criando uma lista e adicionando alguns valores
        List<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista
        System.out.println("Lista 1 (original): " + lista1);

        // Embaralhando a lista
        Collections.shuffle(lista1);

        // Exibindo o resultado
        System.out.println("Lista 1 (embaralhada): " + lista1);

    }
}
