import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {
    public static String getApiKey() {
        Properties properties = new Properties();
        try (InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                throw new RuntimeException("Arquivo config.properties não encontrado!");
            }
            properties.load(input);
            return properties.getProperty("api_key");
        } catch (IOException e) {
            throw new RuntimeException("Erro ao carregar o arquivo de configuração", e);
        }
    }
}