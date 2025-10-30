package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Bem-vindo ao Screen Match!");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(java.net.URI.create("https://www.omdbapi.com/?t=The+Matrix&apikey=5f672b50"))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
