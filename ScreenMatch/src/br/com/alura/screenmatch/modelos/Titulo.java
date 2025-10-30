package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private  int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOMDb meuTituloOMDb) {
        this.nome = meuTituloOMDb.title();

        if(meuTituloOMDb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Ano de lançamento com formato inválido: " + meuTituloOMDb.year());
        } else {
            Integer.valueOf(meuTituloOMDb.year().substring(0,4));
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOMDb.year().substring(0,4));
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOMDb.runtime().substring(0,3).trim());
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes (){
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Título: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaAvaliacoes =  somaAvaliacoes + nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo: " + nome +
                ", Ano de Lançamento: " + anoDeLancamento +
                ", Duração: " + duracaoEmMinutos + " minutos";
    }
}
