package exercicio05.classes;

import java.util.ArrayList;
import java.util.List;

public class Caminhao {
    private String tipoCaminhao;
    private int capacidadeCaminhao;
    private List<Pluviometro> pluviometros = new ArrayList<>();

    public Caminhao(int tipo, int capacidade) {
        this.setTipoCaminhao(tipo, capacidade);
    }

    public String getTipoCaminhao() {
        return tipoCaminhao;
    }

    public int getCapacidadeCaminhao() {
        return capacidadeCaminhao;
    }

    public List<Pluviometro> getPluviometros() {
        return pluviometros;
    }

    public void setTipoCaminhao(int tipoCaminhao, int capacidadeCaminhao) {
        if (tipoCaminhao == 1) {
            this.tipoCaminhao = "ALFA";
            this.capacidadeCaminhao = capacidadeCaminhao;
        } else {
            this.tipoCaminhao = "BETA";
            this.capacidadeCaminhao = capacidadeCaminhao;
        }
    }

    public void setCapacidadeCaminhao(int capacidadeCaminhao) {
        this.capacidadeCaminhao = capacidadeCaminhao;
    }

    public void setPluviometros(List<Pluviometro> pluviometros) {
        this.pluviometros = pluviometros;
    }

    @Override
    public String toString() {
        return "CAMINHÃO >> " +
                "Tipo do Caminhão: '" + tipoCaminhao + '\'' +
                " | Capacidade do Caminhão: " + capacidadeCaminhao +
                " caixas" +
                " | Lista de Pluviometros: " + pluviometros +
                " ";
    }
}
