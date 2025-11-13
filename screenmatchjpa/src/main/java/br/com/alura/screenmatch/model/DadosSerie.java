package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") Integer totalTemporadas,
        @JsonAlias("imdbRating") String avaliacao,
        @JsonAlias ("Genre") Categoria genero,
        @JsonAlias ("Plot") String descricao,
        @JsonAlias("Poster") String poster,
        @JsonAlias("Actors") String atores) {

}
