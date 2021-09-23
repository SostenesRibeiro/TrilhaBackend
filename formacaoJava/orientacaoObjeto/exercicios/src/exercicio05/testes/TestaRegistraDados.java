package exercicio05.testes;

import exercicio05.classes.RegistraDados;

public class TestaRegistraDados {
    public static void main(String[] args) {

        RegistraDados novoRegistro = new RegistraDados();
        novoRegistro.cadastroCaminhao();
        novoRegistro.cadastroPluviometro();
        novoRegistro.selecionaCaminhao();

    }
}

