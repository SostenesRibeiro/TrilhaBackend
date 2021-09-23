package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercicio05 {
    public static void main(String[] args) {

        // Escreva um programa Java para atualizar um elemento
        // específico de uma lista por um outro determinado elemento

        // Criando uma lista e adicionando alguns valores
        List<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista
        System.out.println("Lista 1 (original): " + lista1);

        // Realizando o update, na posição de índice 2, da lista
        lista1.set(2, "Amarela");

        // Exibindo o resultado
        System.out.println("Lista 1 (atualizada): " + lista1);

    }
}
