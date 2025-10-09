package desafioII;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reportContent = "Nossos relatorios de cada dia.";
        ReportGenerator generator = new ReportGenerator(new ConsolePrint());
        
        
        System.out.println("Digite de 1 a 3 para escolher o que deseja fazer com o relatorio: "
        		+ "(1 - imprimir, 2 - resumo, 3 - salvar)");
        int opcao = scanner.nextInt();
        
        
        	if(opcao == 1) {
		        // 1. Imprime o relatório completo na tela
		        generator.generate(reportContent);
        	} else if (opcao == 2) {
		        // 2. Troca a estratégia para mostrar apenas o resumo
		        generator.setStrategy(new SummaryPrint());
		        generator.generate(reportContent);
        	} else if (opcao == 3) {
		        // 3. Troca a estratégia para salvar o conteúdo em arquivo
		        generator.setStrategy(new FilePrint());
		        generator.generate(reportContent);
        	} else {
        		System.out.println("Digite de 1 a 3 por favor");
        	}
    }
}