package apis;
import models.Moneda;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CambioMoneda {

    private final static String API_KEY = "8a29b72a22ff00c5a5089f6a";
    private final static String URL_BASE = "https://v6.exchangerate-api.com/v6";

    public Moneda obtenerCambio(String monedaOrigen, String monedaDestino){
        try{
            // Construyo la URL de la API GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/EUR/GBP/AMOUNT
            String url = URL_BASE + "/" + API_KEY + "/pair/" + monedaOrigen + "/" + monedaDestino;
            // Creo un cliente HTTP y hago la peticion
            HttpClient cliente = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

            HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());

            // Uso Gson para convertir el JSON en un objeto Java
            Gson gson = new Gson();
            return gson.fromJson(response.body(), Moneda.class);
        } catch (Exception e) {
            System.out.println("No se encontró esa moneda.");
            return null;
        }
    }



}
