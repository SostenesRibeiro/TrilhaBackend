package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio09 {
    public static void main(String[] args) {

        // Escreva um programa Java para
        // copiar uma lista para outra

        // Criando uma lista e adicionando alguns valores
        List<String> lista1 = new ArrayList<>();
        lista1.add("1");
        lista1.add("2");
        lista1.add("3");
        lista1.add("4");

        // Criando outra lista e adicionando alguns valores
        List<String> lista2 = new ArrayList<>();
        lista2.add("A");
        lista2.add("B");
        lista2.add("C");
        lista2.add("D");

        // Exibindo as listas
        System.out.println("Lista 1 (original): " + lista1);
        System.out.println("Lista 2 (original): " + lista2);

        // Copiando todo conteúdo da 2a. lista para a 1a.
        Collections.copy(lista2, lista1);

        // Exibindo o resultado
        System.out.println("Lista 1 (original): " + lista1);
        System.out.println("Lista 2 (cópia da lista 1): " + lista2);

    }
}
