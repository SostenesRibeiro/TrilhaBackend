package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercicio04 {
    public static void main(String[] args) {

        // Escreva um programa Java para recuperar um elemento
        // (em um índice específo) de uma determinada lista (pegar o 1o. e 3o. elementos)

        // Criando uma lista e adicionando alguns valores
        List<String> lista1 = new ArrayList<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista
        System.out.println("Lista 1: " + lista1);

        // Pegando os valores dos índices 0 e 2
        String primeiroElemento = lista1.get(0);
        String terceiroElemento = lista1.get(3);

        // Exibindo o resultado
        System.out.println("O primeiro elemento (cor) é: " + primeiroElemento);
        System.out.println("O terceiro elemento (cor) é: " + terceiroElemento);

    }
}
