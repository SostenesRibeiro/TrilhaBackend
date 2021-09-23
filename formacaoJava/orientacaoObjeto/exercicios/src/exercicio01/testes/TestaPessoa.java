package exercicio01.testes;

import exercicio01.classes.Pessoa;

import java.time.LocalDate;

public class TestaPessoa {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Mariana", LocalDate.of(2001, 01, 8), 1.65f);
        pessoa.imprimePessoa();
        pessoa.calculaIdade();
    }

}
