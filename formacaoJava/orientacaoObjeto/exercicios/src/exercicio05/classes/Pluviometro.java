package exercicio05.classes;

public class Pluviometro {
    private String tipoPluviometro;
    private int quantidadePluviometro;

    public Pluviometro(int tipoPlv, int quantidadePlv) {
        this.setTipoPluviometro(tipoPlv, quantidadePlv);
    }

    public String getTipoPluviometro() {
        return tipoPluviometro;
    }

    public int getQuantidadePluviometro() {
        return quantidadePluviometro;
    }

    public void setTipoPluviometro(int tipoPluviometro, int quantidadePluviometro) {
        if (tipoPluviometro == 1) {
            this.tipoPluviometro = "DIGITAL";
            this.quantidadePluviometro = quantidadePluviometro;
        } else {
            this.tipoPluviometro = "ANALÓGICO";
            this.quantidadePluviometro = quantidadePluviometro;
        }
    }

    public void setQuantidadePluviometro(int quantidadePluviometro) {
        this.quantidadePluviometro = quantidadePluviometro;
    }

    @Override
    public String toString() {
        return "PLUVIÔMETRO >> " +
                "tipoPluviometro='" + tipoPluviometro + '\'' +
                " | Quantidade de pluviometros: " + quantidadePluviometro +
                " caixas" +
                " ";
    }

}
