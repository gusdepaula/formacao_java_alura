package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao seu app de músicas!");
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Here Comes Your Man");
        minhaMusica.setArtista("Pixies");
        minhaMusica.setAlbum("Doolittle");
        minhaMusica.setGenero("Rock");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
          minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setHost("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curtir();
        }
    }
}
