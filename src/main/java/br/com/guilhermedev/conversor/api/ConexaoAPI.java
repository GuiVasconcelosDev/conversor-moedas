package br.com.guilhermedev.conversor.api;

import br.com.guilhermedev.conversor.model.Moeda;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConexaoAPI {

    public Moeda buscarTaxa(String moedaBase, String moedaAlvo) {
        String apiKey = "77ea396d198c8d67c34cbf62";
        String endereco = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/" + moedaBase + "/" + moedaAlvo;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moeda.class);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao conectar: " + e.getMessage());
        }
        return null;
    }
}
