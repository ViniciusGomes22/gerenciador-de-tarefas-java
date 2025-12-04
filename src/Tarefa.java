public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean concluida = false;

    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public void concluir() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return (concluida ? "[✔] " : "[ ] ") + titulo + " - " + descricao;
    }
}
