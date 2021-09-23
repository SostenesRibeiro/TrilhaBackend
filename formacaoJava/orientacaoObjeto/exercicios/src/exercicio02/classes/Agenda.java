package exercicio02.classes;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Pessoa> pessoas = new ArrayList<>();

    public boolean armazenaPessoas(String nome, int idade, float altura){
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        if (pessoas.size() < 10){
            pessoas.add(pessoa);
            return true;
        } else {
            System.out.println("DESCULPE! Não é mais possível adicionar contatos na agenda!");
            return false;
        }
    }

    public int buscaPessoa(String nome){
        try {
            for (int i = 0; i <= pessoas.size(); i++) {
                if (pessoas.get(i).getNome().equals(nome)) {
                    System.out.println("Resultado da busca " + "\nO contato: " + nome + "; está alocado no índice: " + i);
                    return i;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Resultado da busca " + "\nDESCULPE! Não encontramos o contato: " + nome + "; na lista!");
        }
        return -1;
    }

    public void removePessoa(String nome){
        int retIndP = buscaPessoa(nome);
        if (retIndP != -1) {
            pessoas.remove(retIndP);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("DESCULPE! Impossível remover tal contato!!!");
        }
    }

    public void imprimeAgenda(){
        for (Pessoa ctt : pessoas) {
            System.out.println("Nome:   " + ctt.getNome());
            System.out.println("Idade:  " +ctt.getIdade());
            System.out.println("Altura: " + ctt.getAltura());
            System.out.println();
        }
    }

    public void imprimePessoa(int ind) {
        try {
            System.out.println("Nome:   " + pessoas.get(ind).getNome());
            System.out.println("Idade:  " + pessoas.get(ind).getIdade());
            System.out.println("Altura: " + pessoas.get(ind).getAltura());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("DESCULPE! Não temos nenhum contato armazenado no índice informado!");
        }
    }

}

//    CÓDIGO ANTES DA IMPLEMENTAÇÃO DO TRY/CATCH
//
//    public void imprimePessoa(int ind) {
//        if (ind >= pessoas.size()) {
//            System.out.println("DESCULPE! Não temos referências para o índice informado!");
//        } else {
//            System.out.println("Nome:   " + pessoas.get(ind).getNome());
//            System.out.println("Idade:  " + pessoas.get(ind).getIdade());
//            System.out.println("Altura: " + pessoas.get(ind).getAltura());
//        }
//    }
