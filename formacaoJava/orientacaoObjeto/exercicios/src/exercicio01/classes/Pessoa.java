package exercicio01.classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private float altura;

    public Pessoa(String nome, LocalDate dataNascimento, float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public void imprimePessoa() {
        System.out.println("Olá, meu nome é: " + getNome() +
                "\nnasci em: " + DateTimeFormatter.ofPattern("dd/MM/yyyy").format(dataNascimento) +
                "\ntenho: " + getAltura() + "m de altura");
    }

    public void calculaIdade() {
        LocalDate dataNascimento = getDataNascimento();
        LocalDate dataAtual = LocalDate.now();
        long idade = ChronoUnit.YEARS.between(dataNascimento, dataAtual);
        System.out.println("e tenho: " + idade + " anos de idade");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}


