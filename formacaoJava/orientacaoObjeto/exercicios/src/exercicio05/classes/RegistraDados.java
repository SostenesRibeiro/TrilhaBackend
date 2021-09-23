package exercicio05.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class RegistraDados extends Controle {
    List<Caminhao> novoCaminhao = new ArrayList<>();
    List<Pluviometro> novoPluviometro = new ArrayList<>();

    public void cadastroCaminhao() {

        System.out.println("DADOS DO(S) CAMINHÃO(ÕES)");
        Boolean registraCaminhao = true;
        while (registraCaminhao) {
            System.out.println("\nDigite tipo do caminhão [1-ALFA | 2-BETA]:");
            int tipoCaminhao = this.leInteiro();
            System.out.println("Digite a capacidade do caminhão [em CAIXAS]: ");
            int capacidadeCaminhao = this.leInteiro();
            Caminhao caminhao = new Caminhao(tipoCaminhao, capacidadeCaminhao);

            novoCaminhao.add(caminhao);

            System.out.println("Deseja adicionar outro caminhão?\nPara continuar digite: [S], para finalizar digite: [FIM]");
            String continua = this.leString().toUpperCase(Locale.ROOT);
            registraCaminhao = !"FIM".equals(continua);
        }
        System.out.println("\nAté o momento, temos a seguinte lista de CAMINHÕES:");
        System.out.println(novoCaminhao + "\n");
    }

    public void cadastroPluviometro() {

        System.out.println("DADOS DO(S) PLUVIÔMETRO(S)");
        Boolean registraPluviometro = true;
        while (registraPluviometro) {
            System.out.println("\nDigite o tipo do pluviômetro [1-DIGITAL | 2-ANALÓGICO]: ");
            int tipoPluviometro = this.leInteiro();
            System.out.println("Digite a quantidade de pluviômetros [em CAIXAS]: ");
            int quantPluviometro = this.leInteiro();
            Pluviometro pluviometro = new Pluviometro(tipoPluviometro, quantPluviometro);

            novoPluviometro.add(pluviometro);

            System.out.println("Deseja add mais pluviômetros?\nPara continuar digite: [S], para finalizar digite: [FIM]");
            String continua = this.leString().toUpperCase(Locale.ROOT);
            registraPluviometro = !"FIM".equals(continua);
        }
        System.out.println("\nAté o momento, temos a seguinte lista de PLUVIÔMETROS:");
        System.out.println(novoPluviometro + "\n");

    }

    public void selecionaCaminhao() {

        System.out.println("SELECIONA O CAMINHÃO PARA TRANSPORTE\n");

        int quantidadeDePluviometros = 0;
        for (int i = 0; i < novoPluviometro.size(); i++) {
            quantidadeDePluviometros = quantidadeDePluviometros + novoPluviometro.get(i).getQuantidadePluviometro();
        }

        Boolean temCaminhaoApto = false;
        List<Integer> caminhoesAptos = new ArrayList<>();

        for (int i = 0; i < novoCaminhao.size(); i++) {
            if(quantidadeDePluviometros <= (novoCaminhao.get(i).getCapacidadeCaminhao())) {
                caminhoesAptos.add(i);
                temCaminhaoApto = true;
            }
        }

        if (temCaminhaoApto) {
            for (Integer indice : caminhoesAptos) {
                novoCaminhao.get(indice).setPluviometros(novoPluviometro);
                System.out.println("O caminhão selecionado é do tipo: " + novoCaminhao.get(indice).getTipoCaminhao());
                System.out.println("Sua capacidade de tranporte é de: " + novoCaminhao.get(indice).getCapacidadeCaminhao() + " Caixa(s)");
                System.out.println("A lista de pluviômetros a embarcar é: " + novoCaminhao.get(indice).getPluviometros());
            }
        } else {
            System.out.println("DESCULPE! Mas não há caminhão com capacidade suficiente para o transporte!");
        }

    }

}

