import java.io.*;

public interface GeraArquivo {

    // Metodo para escrever o arquivo txt
    static void escrita(String dados) {
        try {
            FileWriter arq = new FileWriter("LogConversoes.txt");
            PrintWriter out = new PrintWriter(arq);
            out.println(dados);
            arq.close();

        } catch (IOException erro) {
            System.out.println("Erro na geração do relatório.");
        }
    }
}