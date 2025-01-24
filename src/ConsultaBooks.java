import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaBooks {

    public void livro(String book){
        String endereco;
        endereco = "https://www.googleapis.com/books/v1/volumes?q=" + book.replace(" ","%20");
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

        } catch (Exception e) {
            System.out.println("Livro nao foi encontrado");
            System.out.println(e.getMessage());
        }
    }
}
