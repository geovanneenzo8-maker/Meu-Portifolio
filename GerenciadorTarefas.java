import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;
    private int proximoId;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
        this.proximoId = 1; // Contador sequencial de IDs
    }

    public void adicionarTarefa(String titulo) {
        Tarefa novaTarefa = new Tarefa(proximoId++, titulo);
        tarefas.add(novaTarefa);
        System.out.println("Tarefa cadastrada com sucesso! (ID: " + novaTarefa.getId() + ")");
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada no momento.");
            return;
        }

        System.out.println("\n--- Lista de Tarefas ---");
        for (Tarefa t : tarefas) {
            System.out.println(t);
        }
    }

    public boolean concluirTarefa(int id) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                t.marcarComoConcluida();
                return true;
            }
        }
        return false;
    }

    public boolean removerTarefa(int id) {
        return tarefas.removeIf(t -> t.getId() == id);
    }
}