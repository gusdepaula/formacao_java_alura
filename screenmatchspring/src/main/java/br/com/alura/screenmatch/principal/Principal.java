package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.service.ConsumoAPI;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();

    private final String ENDERECO = "https://www.omdbapi.com/?t";
    private final String API_KEY = "&apikey=5f672b50"

    public Principal(String endereco, String apiKey) {
        ENDERECO = endereco;
        API_KEY = apiKey;
    }

    public void exibeMenu() {
        System.out.println("Digite o nome da série que deseja buscar:");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);

        System.out.println("Você buscou pela série: " + json);
    }
}
