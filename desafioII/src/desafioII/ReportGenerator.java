package desafioII;

class ReportGenerator {
    private PrintStrategy strategy;

    public ReportGenerator(PrintStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PrintStrategy strategy) {
        this.strategy = strategy;
    }

    public void generate(String content) {
        System.out.println("\nGerando Relatório...");
        this.strategy.print(content);
    }
}