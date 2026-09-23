import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Catalogo catalogo = new Catalogo();

        int opcao = -1;

        System.out.println("Sistema iniciado com sucesso!");

        while (opcao <= 0){
            System.out.println("\n=================================");
            System.out.println("       CATÁLOGO DE JOGOS         ");
            System.out.println("=================================");
            System.out.println("1 - Cadastrar novo jogo");
            System.out.println("2 - Listar todos os jogos");
            System.out.println("3 - Registrar horas jogadas");
            System.out.println("4 - Ver total de horas jogadas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            // Leitura segura da opção digitada
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida! Digite apenas números.");
                continue; // Volta para o início do while sem travar o programa
            }
        }
            switch(opcao){
                case 1:
                    System.out.println("Digite o titulo do jogo: ");
                    String titulo = scanner.nextLine();

                    System.out.println("Digite a plataforma (ex: PC, PS5, XBOX): ");
                    String plataforma = scanner.nextLine();

                    if (titulo.trim().isEmpty() || plataforma.trim().isEmpty()) {
                        System.out.println("Erro: Título e plataforma não podem ser vazios.");
                    } else{
                        catalogo.adicionarJogo(titulo, plataforma);
                    }
                    break;
                case 2:
                    catalogo.listarJogos();
                    break;
                case 3:
                    try{
                    System.out.println("Digite o ID do jogo: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.println("Quantas horas deseja somar ao jogo? : ");
                    double horas = Double.parseDouble(scanner.nextLine());

                    boolean sucesso = catalogo.registrarHoras(id, horas);
                    if (sucesso) {
                        System.out.println("Horas registradas com sucesso!");
                    } else {
                        System.out.println("Não foi possível registrar suas horas");
                    }}
                    catch(NumberFormatException e) {
                        System.out.println("Erro: Digite Numeros validos para ID e horas.");
                    }
                    break;
                case 4:
                    double total = catalogo.calcularTotalHoras();
                    System.out.println("Total acumulado de horas jogadas: %.1fh" + total);
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até a próxima!");
                    break;

                default:
                    System.out.println("Digite um numero valido, por favor! Entre 0 e 4.");
                    break;


        }
        System.out.println("Encerrando o programa. Até a próxima!");
        scanner.close();
        }
    }
