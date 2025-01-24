import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ConsultaBooks consultaBooks = new ConsultaBooks();

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o Livro Desejado: ");
        String livro = leitura.nextLine();

        consultaBooks.livro(livro);
    }
}
