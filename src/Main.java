import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();

        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(new Tarefa(titulo, descricao));
                }
                case 2 -> gerenciador.listarTarefas();
                case 3 -> {
                    gerenciador.listarTarefas();
                    System.out.print("Número da tarefa para concluir: ");
                    int indice = scanner.nextInt() - 1;
                    gerenciador.concluirTarefa(indice);
                }
                case 4 -> {
                    gerenciador.listarTarefas();
                    System.out.print("Número da tarefa para remover: ");
                    int indice = scanner.nextInt() - 1;
                    gerenciador.removerTarefa(indice);
                }
                case 0 -> System.out.println("👋 Saindo...");
                default -> System.out.println("⚠️ Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
