package exercicio03.classes;

public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidade;
    private int qtdPessoas = 0;

    public void inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        System.out.println("Olá, bom dia! Bem vind@ ao elevador que te conduzirá à vaga junior developer!");
        System.out.println("Você está no térreo e a capacidade deste elevador é de: " + capacidade + ", pessoa(s)!");
        System.out.println("Ahh... Este prédio tem: " + totalAndares + " andar(es) além do térreo!");
        System.out.println();
    }

    public void entra() {
        qtdPessoas = getQtdPessoas();
        if (qtdPessoas < capacidade) {
            qtdPessoas = qtdPessoas + 1;
            System.out.println("Uma pessoa acaba de ENTRAR!");
            System.out.println("O total de pessoas, no momento é: " + qtdPessoas);
        } else {
            System.out.println("Desculpe! A capacidade do elevador foi atingida!");
            System.out.println("Considere subir pelas escadas. Afinal, um pouco de exercício não faz mal a ninguém!!!");
            System.out.println("O total de pessoas, no momento é: " + qtdPessoas);

        }
    }

    public void sai() {
        qtdPessoas = getQtdPessoas();
        if (qtdPessoas > 0) {
            qtdPessoas = qtdPessoas - 1;
            System.out.println("Uma pessoa acaba de SAIR!");
            System.out.println("O total de pessoas, no momento é: " + qtdPessoas);
        } else {
            System.out.println("Opa! O elevador já está vazio!");
            System.out.println("Ah não ser que estejamos transportando fantasmas!!!");
            System.out.println("O total de pessoas, no momento é: " + qtdPessoas);
        }
    }

    public void sobe() {
        andarAtual = getAndarAtual();
        if (andarAtual < totalAndares) {
            andarAtual = andarAtual + 1;
            System.out.println("O elevador acaba de SUBIR um andar!");
            System.out.println("O andar atual é o: " + andarAtual);
        } else {
            System.out.println("Opa! Você já está no último andar!");
            System.out.println("Além daqui, só se você morrer e for pro céu!!!");
            System.out.println("O andar atual é o: " + andarAtual);
        }
    }

    public void desce() {
        andarAtual = getAndarAtual();
        if (andarAtual > 0) {
            andarAtual = andarAtual - 1;
            System.out.println("O elevador acaba de DESCER um andar!");
            System.out.println("O andar atual é o: " + andarAtual);
        } else {
            System.out.println("Opa! Você já está no térreo!");
            System.out.println("Além daqui, só se você morrer e (DEUS O LIVRE) for pro inferno!!!");
            System.out.println("O andar atual é o: " + andarAtual);
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }
}
