package hashSet;

import java.util.HashSet;

public class Exercicio04 {
    public static void main(String[] args) {

        // Escreva um programa Java
        // para esvaziar um conjunto hash

        // Criando uma lista e adicionando alguns valores
        HashSet<String> lista1 = new HashSet<>();
        lista1.add("Vermelha");
        lista1.add("Verde");
        lista1.add("Laranja");
        lista1.add("Branca");
        lista1.add("Preta");

        // Exibindo a lista 1
        System.out.println("Lista 1 (original): " + lista1);

        // Esvaziando uma lista hash
        lista1.removeAll(lista1);

        // Exibindo o resultado
        System.out.println("Lista 1 (alterada): " + lista1);

    }
}
