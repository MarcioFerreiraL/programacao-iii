package desafioII;

class SummaryPrint implements PrintStrategy {
	
    @Override
    public void print(String report) {

        String summary = report.substring(0, 5);
        System.out.println("\n--- RESUMO DO RELATÓRIO ---");
        System.out.println(summary + "...");
        System.out.println("---------------------------");
    }
}