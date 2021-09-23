package exercicio04.Testes;

import exercicio04.Classes.ControleRemoto;

public class TestaTelevisao {
    public static void main(String[] args) {

        ControleRemoto controle = new ControleRemoto();
        controle.mostraCanalVolume();
        System.out.println();

        controle.aumentaCanal();
        controle.mostraCanalVolume();
        System.out.println();

        controle.aumentaVolume();
        controle.mostraCanalVolume();
        System.out.println();

        controle.diminueCanal();
        controle.mostraCanalVolume();
        System.out.println();

        controle.diminueVolume();
        controle.mostraCanalVolume();
        System.out.println();

        controle.trocarCanal(0);
        System.out.println();

        controle.mostraCanalVolume();

    }
}
