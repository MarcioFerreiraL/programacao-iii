package desafioII;

class ConsolePrint implements PrintStrategy {
    @Override
    public void print(String report) {
        System.out.println("\n--- RELATÓRIO COMPLETO ---");
        System.out.println(report);
        System.out.println("--------------------------");
    }
}