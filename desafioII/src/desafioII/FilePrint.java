package desafioII;

import java.io.FileWriter;
import java.io.IOException;

class FilePrint implements PrintStrategy {
    private static final String FILENAME = "relatorio.txt";

    @Override
    public void print(String report) {
        try (FileWriter writer = new FileWriter(FILENAME)) {
            writer.write(report);
            System.out.println("\nRelatório salvo com sucesso em: " + FILENAME);
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}      


