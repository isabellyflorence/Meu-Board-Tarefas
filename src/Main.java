import model.Tarefa;
import repository.TarefaRepository;
import service.TarefaService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TarefaRepository repository = new TarefaRepository();
        TarefaService service = new TarefaService(repository);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Criar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Atualizar status");
            System.out.println("4 - Remover tarefa");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // consumir newline

            switch (opcao) {
                case 1 -> {
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Prioridade (Baixa/Média/Alta): ");
                    String prioridade = scanner.nextLine();
                    service.criarTarefa(titulo, descricao, prioridade);
                }
                case 2 -> service.listarTarefas().forEach(System.out::println);
                case 3 -> {
                    System.out.print("ID da tarefa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo status: ");
                    String status = scanner.nextLine();
                    if (!service.atualizarStatus(id, status)) System.out.println("Tarefa não encontrada.");
                }
                case 4 -> {
                    System.out.print("ID da tarefa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    if (!service.removerTarefa(id)) System.out.println("Tarefa não encontrada.");
                }
                case 0 -> { System.out.println("Saindo..."); return; }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}
