import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public String escolherMoeda(String tipo) {
        while (true) {
            System.out.println("Escolha a moeda " + tipo + ":\n" +
                    "1- Peso Argentino\n" +
                    "2- Boliviano da Bolívia\n" +
                    "3- Real Brasileiro\n" +
                    "4- Peso Chileno\n" +
                    "5- Peso Colombiano\n" +
                    "6- Dólar americano\n" +
                    "7- Dólar canadense\n" +
                    "8- SAIR");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    return "ARS"; // Peso Argentino
                case 2:
                    return "BOB"; // Boliviano boliviano
                case 3:
                    return "BRL"; // Real Brasileiro
                case 4:
                    return "CLP"; // Peso Chileno
                case 5:
                    return "COP"; // Peso Colombiano
                case 6:
                    return "USD"; // Dólar Americano
                case 7:
                    return "CAD"; // Dólar Canadense
                case 8:
                    System.out.println("Saindo...");
                    return null; // Indica que o programa deve encerrar
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public double capturarValor() {
        System.out.println("Digite o valor que deseja converter: ");
        return scanner.nextDouble();
    }
}
