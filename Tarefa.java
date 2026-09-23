public class Tarefa {
    private int id;
    private String titulo;
    private boolean concluida;

    public Tarefa(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.concluida = false; // Toda tarefa vai começar pendente
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void marcarComoConcluida() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        String status = concluida ? "[X] Concluída" : "[ ] Pendente";
        return String.format("#%d - %s | %s", id, titulo, status);
    }
}