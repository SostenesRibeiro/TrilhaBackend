package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {
    public static void main(String[] args) {

        // Escreva um programa Java para inserir
        // um elemento, na lista, na primeira posição

        // Criando uma lista e adicionando alguns valores
        List<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista
        System.out.println("Lista 1 (original): " + lista1);

        // Adicionando um elemento na primeira posição da lista
        lista1.add(0, "Rosa");

        // Exibindo o resultado
        System.out.println("Lista 1 (modificada): " + lista1);

    }
}
