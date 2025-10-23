package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int totaldeCurtidas;
    private double classificacao;

    public Audio(String titulo) {
        this.titulo = titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotaldeCurtidas() {
        return totaldeCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void curtir() {
        totaldeCurtidas++;
    }

    public void reproduzir() {
        totalDeReproducoes++;
    }
}
