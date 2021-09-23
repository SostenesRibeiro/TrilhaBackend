package exercicio02.testes;

import exercicio02.classes.Agenda;


public class TestaAgenda {
    public static void main(String[] args) {

        // Criando e adicionando referências em Agenda
        Agenda agenda = new Agenda();
        agenda.armazenaPessoas("Rayssa Nóbrega", 30, 1.67f);
        agenda.armazenaPessoas("João Drapala", 23, 1.75f);
        agenda.armazenaPessoas("Tayse Maia", 23, 1.65f);
        agenda.armazenaPessoas("Pablo Godoy", 23, 1.80f);
        agenda.armazenaPessoas("Adriano Santos", 25, 1.79f);
        agenda.armazenaPessoas("Mácio Meneses", 25, 1.77f);
        agenda.armazenaPessoas("Letícia Félix", 22, 1.70f);
        agenda.armazenaPessoas("Hywenklis Oliveira", 23, 1.90f);
        agenda.armazenaPessoas("Kamilla Faust", 21, 1.70f);
        agenda.armazenaPessoas("Ruth Dantas", 29, 1.69f);
        agenda.armazenaPessoas("Super Mário", 39, 1.55f);

        System.out.println(">>> Mensagem de erro por tentativa de adição de mais de 10 contatos");
        System.out.println();
        agenda.buscaPessoa("Ruth Dantas");
        System.out.println(">>> Mensagem de referência encontrada");
        System.out.println();
        agenda.buscaPessoa("Ruth Dantass");
        System.out.println(">>> Mensagem de referência NÃO encontrada");
        System.out.println();
        agenda.removePessoa("Mácio Meneses");
        System.out.println(">>> Mensagem de referência removida com sucesso");
        System.out.println();
        agenda.removePessoa("Mácio Meneses");
        System.out.println(">>> Mensagem de referência NÃO removida");
        System.out.println();
        agenda.imprimePessoa(3);
        System.out.println(">>> Exibição da referência correspondente ao índice repassado");
        System.out.println();
        agenda.imprimePessoa(11);
        System.out.println(">>> Mensagem de erro ao tentar exibir referência correspondente ao índice repassado");
        System.out.println();
        agenda.imprimeAgenda();

    }
}
