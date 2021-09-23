package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercicio06 {
    public static void main(String[] args) {

        // Escreva um programa Java para remover
        // o terceiro elemento de uma lista

        // Criando uma lista e adicionando alguns valores
        List<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista
        System.out.println("Lista 1 (original): " + lista1);

        // Removendo o conteúdo, da posição 2, da lista
        lista1.remove(2);

        // Exibindo o resultado
        System.out.println("Lista 1 (sem elemento do índice 2): " + lista1);

    }
}
