package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if(audio.getClassificacao() >= 9){
            System.out.println("Adicionando aos favoritos: " + audio.getTitulo());
        } else {
            System.out.println("Áudio " + audio.getTitulo() + " não é favorito.");
        }
    }
}
