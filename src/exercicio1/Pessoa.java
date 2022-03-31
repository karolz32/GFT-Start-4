package exercicio1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Double altura;

    public Pessoa(String nome, LocalDate dataNascimento, Double altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
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

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return  "Nome: " + nome + " | " +
                "Data de nascimento: " + dataNascimento + " | " +
                "Altura: " + altura;
    }

    public int calcularIdade(){
        LocalDate hoje = LocalDate.now();
        Period idadeAtual = Period.between(this.getDataNascimento(), hoje);
        return idadeAtual.getYears();
    }
}
