import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== GERENCIADOR DE TAREFAS ===");
            System.out.println("1 - Adicionar nova tarefa");
            System.out.println("2 - Listar todas as tarefas");
            System.out.println("3 - Marcar tarefa como concluída");
            System.out.println("4 - Remover tarefa");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Digite apenas números.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();
                    if (titulo.trim().isEmpty()) {
                        System.out.println("O título não pode ser vazio.");
                    } else {
                        gerenciador.adicionarTarefa(titulo);
                    }
                    break;

                case 2:
                    gerenciador.listarTarefas();
                    break;

                case 3:
                    System.out.print("Digite o ID da tarefa a concluir: ");
                    int idConcluir = Integer.parseInt(scanner.nextLine());
                    if (gerenciador.concluirTarefa(idConcluir)) {
                        System.out.println("Tarefa marcada como concluída!");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o ID da tarefa a remover: ");
                    int idRemover = Integer.parseInt(scanner.nextLine());
                    if (gerenciador.removerTarefa(idRemover)) {
                        System.out.println("Tarefa removida com sucesso!");
                    } else {
                        System.out.println("Tarefa não encontrada.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando a aplicação...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}