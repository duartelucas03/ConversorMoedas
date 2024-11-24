import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Menu menu = new Menu();
        ArrayList<Object> log = new ArrayList<>();

        while (true) {
            String moedaBase = menu.escolherMoeda("base");
            if (moedaBase == null) break;

            String moedaFinal = menu.escolherMoeda("final");
            if (moedaFinal == null) break;

            double valor = menu.capturarValor();

            Conversor c1 = new Conversor(moedaBase, moedaFinal, valor);

            LocalDateTime agora = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm:ss");
            String dataFormatada = agora.format(formatter);

            String mensagemFinal = "Conversão realizada: " + moedaBase + " para " + moedaFinal + " - Valor: " + c1.getValorFinal() + " - " + dataFormatada + "\n";
            System.out.println(mensagemFinal);

            log.add(mensagemFinal);

        }
        String temp = "Log de conversão: \n";
        for (Object lista : log) {
            temp+= lista;
        }
        GeraArquivo.escrita(temp);
    }
}
