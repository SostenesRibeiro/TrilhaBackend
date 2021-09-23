package exercicio05.classes;

import java.util.Scanner;

public class Controle {
    Scanner sc = new Scanner(System.in);

    public String leString() {
        return this.getScanner().nextLine();
    }

    public int leInteiro() {
        return Integer.parseInt(getScanner().nextLine());
    }

    public Scanner getScanner() {
        return sc;
    }

}
