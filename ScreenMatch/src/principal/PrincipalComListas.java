package principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar", 2009);
        outroFilme.avalia(8);
        Filme filmedoPaulo = new Filme("Dog ville", 2003);
        filmedoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmedoPaulo);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("É um filme!");
                System.out.println("Classificação " + filme.getClassificacao());
            } else {
                System.out.println(item.getNome() + " não é um filme ou a classificação é menor ou igual a 2!" );
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Denzel Washington");
        buscaPorArtista.add("Sandra Bullock");
        buscaPorArtista.add("Cameron Diaz");
        System.out.println("Artista no índice 0: " + buscaPorArtista.get(0));

        Collections.sort(buscaPorArtista);
        System.out.println("Lista de artistas ordenada: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Lista de títulos ordenada: ");
        System.out.println(lista);
    }
}
