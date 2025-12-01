package br.com.alura.screensound.principal;

import br.com.alura.screensound.model.Artista;
import br.com.alura.screensound.model.TipoArtista;
import br.com.alura.screensound.repository.ArtistaRepository;

import java.util.Scanner;

public class Principal {


    private final ArtistaRepository repositorio;
    private Scanner leitura = new Scanner(System.in);

    public Principal(ArtistaRepository repositorio){
        this.repositorio = repositorio;
    }

    public void exibeMenu() {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    *** Screensoud Application ***
                    1 - Cadastrar artistas
                    2 - Cadastrar músicas
                    3 - Listar músicas
                    4 - Buscar músicas por artista
                    5 - Pesquisar dados sobre um artista
                    0 - Sair
                    """;
            System.out.println(menu);


            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtista();
                    break;
                case 2:
                    cadastrarMusica();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    buscarMusicasPorArtista();
                    break;
                case 5:
                    pesquisarDadosArtista();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void pesquisarDadosArtista() {
    }

    private void buscarMusicasPorArtista() {
    }

    private void listarMusicas() {
    }

    private void cadastrarMusica() {
    }

    private void cadastrarArtista() {
        var cadastraNovo = "S";

        while (cadastraNovo.equalsIgnoreCase("s")){
            System.out.println("Informe o nome do artista");
            var nome = leitura.nextLine();
            System.out.println("Informe o tipo desse artista: (solo, dupla ou banda)");
            var tipo = leitura.nextLine();
            TipoArtista tipoArtista = TipoArtista.valueOf(tipo.toUpperCase());
            Artista artista = new Artista(nome, tipoArtista);
            repositorio.save(artista);
            System.out.println("Cadastrar novo artista? (S/N)");
            cadastraNovo = leitura.nextLine();
        }

    }
}