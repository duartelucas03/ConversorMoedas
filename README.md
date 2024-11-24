
### **Conversor de Moedas**

Este projeto é um programa Java que realiza conversões de moedas entre diferentes unidades monetárias, utilizando a API ExchangeRate-API para obter taxas de câmbio atualizadas. O programa permite ao usuário selecionar moedas base e destino, bem como o valor a ser convertido, e exibe o resultado formatado. Também mantém um log das conversões realizadas.

---

### **Funcionalidades**
- Seleção de moeda base e moeda de destino.
- Conversão de valores com base em taxas de câmbio reais.
- Suporte para as seguintes moedas:
  - **ARS** - Peso Argentino
  - **BOB** - Boliviano da Bolívia
  - **BRL** - Real Brasileiro
  - **CLP** - Peso Chileno
  - **COP** - Peso Colombiano
  - **USD** - Dólar Americano
  - **CAD** - Dólar Canadense
- Log de todas as conversões realizadas em um arquivo `.txt`.
- Validação de entradas do usuário.
- Menu interativo para melhor experiência.

---

### **Requisitos**
- **Java 11+**
- Dependências externas:
  - `com.google.gson` para manipulação de JSON (biblioteca GSON para parse e serialização).
- Uma chave de API válida da **ExchangeRate-API**.

---

### **Estrutura do Projeto**
- **`src/`**: Diretório com o código-fonte do projeto.
  - **`Principal`**: Classe principal que executa o programa.
  - **`Menu`**: Classe responsável por exibir menus interativos e capturar entradas do usuário.
  - **`Conversor`**: Classe que realiza as chamadas à API e realiza a conversão.
  - **`ConfigLoader`**: Classe que carrega a chave da API do arquivo `config.properties`.
  - **`GeraArquivo`**: Classe que escreve o log de conversões realizadas em um arquivo `.txt`.
  - **`Informacoes`**: Representação do JSON retornado pela API.
- **`config.properties`**: Arquivo que armazena a chave da API ExchangeRate-API.
- **`LogConversoes.txt`**: Arquivo gerado com o log das conversões realizadas.

---

### **Como Configurar e Executar**
1. **Clonar o repositório**:
   ```bash
   git clone https://github.com/duartelucas03/ConversorMoedas
   cd ConversorMoedas
   ```

2. **Configurar a chave da API**:
   - Abra o arquivo `config.properties` no diretório raiz.
   - Adicione sua chave da API:
     ```properties
     api_key=SUA_CHAVE_AQUI
     ```

3. **Compilar e executar**:
   - Compile o projeto:
     ```bash
     javac -d out src/*.java
     ```
   - Execute o programa:
     ```bash
     java -cp out Principal
     ```

---

### **Exemplo de Uso**
1. Execute o programa.
2. Escolha a moeda base:
   ```
   Escolha a moeda base:
   1- Peso Argentino
   2- Boliviano da Bolívia
   ...
   8- SAIR
   ```
3. Escolha a moeda de destino e insira o valor a ser convertido.
4. Veja o resultado:
   ```
   Conversão realizada: USD para BRL - Valor: 349.52 - 24/11/2024 - 00:10:15
   ```
5. O log será salvo automaticamente no arquivo `LogConversoes.txt`.

---

### **Logs de Conversões**
As conversões realizadas são registradas no arquivo `LogConversoes.txt` no formato:
```
Log de conversão:
Conversão realizada: USD para BRL - Valor: 349.52 - 23/11/2024 - 10:00:50
Conversão realizada: BRL para CAD - Valor: 500.00 - 23/11/2024 - 10:01:15
```

---

### **Melhorias Futuras**
- Suporte para mais moedas.
- Interface gráfica para simplificar o uso.
- Opção para salvar logs em diferentes formatos, como `.csv`.
- Melhor tratamento de erros de API e de conexão.

---

### **Contribuição**
Contribuições são bem-vindas! Sinta-se à vontade para abrir *issues* ou enviar *pull requests* com melhorias.
