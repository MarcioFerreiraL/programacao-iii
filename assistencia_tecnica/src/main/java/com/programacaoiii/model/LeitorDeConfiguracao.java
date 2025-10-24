package com.programacaoiii.model;
import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;

public class LeitorDeConfiguracao {

    public static void main(String[] args) {
        // Cria um objeto Properties
        Properties props = new Properties();
        
        // Define o nome do arquivo que está no classpath
        String nomeArquivo = "/assistencia_tecnica/src/main/resources/application.properties";

        // Tenta carregar o arquivo como um "recurso" do sistema
        try (InputStream inputStream = LeitorDeConfiguracao.class.getClassLoader().getResourceAsStream(nomeArquivo)) {
            
            if (inputStream == null) {
                System.out.println("Desculpe, não foi possível encontrar o arquivo: " + nomeArquivo);
                return;
            }
            
            // Carrega as propriedades do arquivo
            props.load(inputStream);

            // Agora você pode ler os valores
            String usuario = props.getProperty("database.user");
            String url = props.getProperty("database.url");
            String senha = props.getProperty("database.password");

            // Imprime no console para testar
            System.out.println("--- Lendo Configurações ---");
            System.out.println("URL: " + url);
            System.out.println("Usuário: " + usuario);
            System.out.println("Senha: " + senha);
            
        } catch (IOException ex) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            ex.printStackTrace();
        }
    }
}
