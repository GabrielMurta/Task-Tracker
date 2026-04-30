import repository.TaskRepository;
import services.TaskServices;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskRepository repository = new TaskRepository();
        TaskServices service = new TaskServices(repository);

        int opcao;

        do {
            System.out.println("\n===== MENU TASK =====");
            System.out.println("1 - Criar Task");
            System.out.println("2 - Atualizar Task");
            System.out.println("3 - Deletar Task");
            System.out.println("4 - Marcar como In Progress");
            System.out.println("5 - Marcar como Done");
            System.out.println("6 - Listar Tasks");
            System.out.println("7 - Listar In Progress");
            System.out.println("8 - Listar Done");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Id: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Descrição: ");
                    String desc = scanner.nextLine();

                    service.CreateTask(id, desc, new Date());
                    break;

                case 2:
                    System.out.print("Id da Task: ");
                    int idUpdate = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nova descrição: ");
                    String newDesc = scanner.nextLine();

                    service.UpdateTask(idUpdate, newDesc, new Date());
                    break;

                case 3:
                    System.out.print("Id da Task: ");
                    int idDelete = scanner.nextInt();

                    service.DeleteTask(idDelete);
                    break;

                case 4:
                    System.out.print("Id da Task: ");
                    int idProgress = scanner.nextInt();

                    service.SetAsInProgress(idProgress);
                    break;

                case 5:
                    System.out.print("Id da Task: ");
                    int idDone = scanner.nextInt();

                    service.SetAsDone(idDone);
                    break;

                case 6:
                    service.ListTask();
                    break;

                case 7:
                    service.ListInProgressTask();
                    break;

                case 8:
                    service.ListDoneTask();
                    break;

                case 0:

                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}