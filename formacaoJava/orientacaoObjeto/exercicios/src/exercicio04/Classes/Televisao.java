package exercicio04.Classes;

public class Televisao {
    private int canal;
    private int volume;

    public Televisao(int canalInicial, int volumeInicial) {
        this.canal = canalInicial;
        this.volume = volumeInicial;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
