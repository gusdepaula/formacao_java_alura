package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOMDb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = leitura.nextLine();
        String buscaFormatada = busca.replace(" ", "+");
        String endereco = "https://www.omdbapi.com/?t=" + buscaFormatada + "&apikey=5f672b50";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(java.net.URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        TituloOMDb meuTituloOMDb = gson.fromJson(json, TituloOMDb.class);

        try {
            Titulo meuTitulo = new Titulo(meuTituloOMDb);
            System.out.println("Título: " + meuTitulo.getNome());
            System.out.println("Ano de Lançamento: " + meuTitulo.getAnoDeLancamento());
            System.out.println("Duração: " + meuTitulo.getDuracaoEmMinutos() + " minutos");
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro ao tentar converter os dados de duração ou ano de lançamento.");
            System.out.println(e.getMessage());
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        }
    }
}
