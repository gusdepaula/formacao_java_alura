package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String host;
    private Sting descricao;

    public Sting getDescricao() {
        return descricao;
    }

    public void setDescricao(Sting descricao) {
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
