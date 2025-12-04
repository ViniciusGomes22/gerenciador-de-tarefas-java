import java.util.ArrayList;

public class GerenciadorDeTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("✅ Tarefa adicionada com sucesso!");
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("📭 Nenhuma tarefa cadastrada.");
            return;
        }
        System.out.println("\n=== LISTA DE TAREFAS ===");
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(i + 1 + " - " + tarefas.get(i));
        }
    }

    public void concluirTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).concluir();
            System.out.println("🎉 Tarefa concluída!");
        } else {
            System.out.println("⚠️ Índice inválido!");
        }
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
            System.out.println("🗑️ Tarefa removida!");
        } else {
            System.out.println("⚠️ Índice inválido!");
        }
    }
}
