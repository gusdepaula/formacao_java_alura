package principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

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
            Filme filme = (Filme) item;
            System.out.println("Classificação " + filme.getClassificacao());
        }
    }
}
