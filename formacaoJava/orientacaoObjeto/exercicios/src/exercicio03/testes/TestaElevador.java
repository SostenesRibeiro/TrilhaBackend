package exercicio03.testes;

import exercicio03.classes.Elevador;

public class TestaElevador {
    public static void main(String[] args) {

        //Instanciando um elevador
        Elevador elevador = new Elevador();

        // Inicializando os valores de capacidade e quantidade de andares
        elevador.inicializa(10, 13);

        // Embarcando pessoas
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();

        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();

        elevador.entra();

        System.out.println();

        // Desembarcando pessoas
        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.sai();

        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.sai();
        elevador.sai();

        elevador.sai();

        System.out.println();

        // Subindo os andares do prédio
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();

        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();

        elevador.sobe();
        elevador.sobe();
        elevador.sobe();
        elevador.sobe();

        System.out.println();

        // Descendo os andares do prédio
        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.desce();

        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.desce();

        elevador.desce();
        elevador.desce();
        elevador.desce();
        elevador.desce();

    }
}
