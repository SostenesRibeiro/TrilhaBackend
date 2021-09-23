package exercicio04.Classes;

public class ControleRemoto {

    int canalMinimo = 1;
    int volumeMinimo = 1;
    int canalMaximo = 99;
    int volumeMaximo = 99;

    Televisao televisao = new Televisao(10,10);

    public void mostraCanalVolume() {
        int canal = televisao.getCanal();
        int volume = televisao.getVolume();
        System.out.println("O televisor está no canal: " + canal);
        System.out.println("E o volume está em: " + volume);
    }

    public void trocarCanal(int canalDesejado) {
        if (canalDesejado <= canalMaximo && canalDesejado >= canalMinimo) {
            televisao.setCanal(canalDesejado);
        } else {
            System.out.println("Escolha um canal ENTRE 1 e 99!");
        }
    }

    public void aumentaCanal() {
        int canal = televisao.getCanal();
        if (canal < canalMaximo) {
            canal++;
            televisao.setCanal(canal);
        } else {
            System.out.println("Você já está no ÚLTIMO canal da grade!");
        }
    }

    public void diminueCanal() {
        int canal = televisao.getCanal();
        if (canal > canalMinimo) {
            canal--;
            televisao.setCanal(canal);
        } else {
            System.out.println("Você já está no PRIMEIRO cana da grade!");
        }
    }

    public void aumentaVolume() {
        int volume = televisao.getVolume();
        if (volume < volumeMaximo) {
            volume++;
            televisao.setVolume(volume);
        } else {
            System.out.println("O volume já está no MÁXIMO!");
        }
    }

    public void diminueVolume() {
        int volume = televisao.getVolume();
        if (volume > volumeMinimo) {
            volume--;
            televisao.setVolume(volume);
        } else {
            System.out.println("O volume já está no MÍNIMO!");
        }
    }

}
