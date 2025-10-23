package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public Podcast(String titulo) {
        super(titulo);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public int getClassificacao() {
        if(this.getTotaldeCurtidas() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
