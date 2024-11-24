import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.ObjectInputFilter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {

    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .setPrettyPrinting()
            .create();

    private Double valorFinal;

    public Conversor(String moedaBase, String moedaFinal, Double valor) {
        String apiKey = ConfigLoader.getApiKey();
        String quantidade = String.valueOf(valor);

        String endereco = "https://v6.exchangerate-api.com/v6/" + apiKey
                + "/pair/" + moedaBase + "/" + moedaFinal + "/" + quantidade;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            Informacoes convertido = gson.fromJson(json, Informacoes.class);

            this.valorFinal = convertido.conversion_result();


        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Double getValorFinal(){
        return valorFinal;
    }
}
